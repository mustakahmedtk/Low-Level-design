package ParkingLot.Services;

import ParkingLot.Exception.ParkingLotNotAvailbleException;
import ParkingLot.Exception.ParkingSpotNotAvailable;
import ParkingLot.Models.*;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Strategies.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {

    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;

    private ParkingLotRepository parkingLotRepository;


    public TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository) {
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }

    public Ticket getTicket(Vehicle vehicle, EntryGate entryGate) throws ParkingSpotNotAvailable , ParkingLotNotAvailbleException {
        ParkingSpot availableSpot = parkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(), parkingLotRepository.getParkingLotFromGate(entryGate));

        Ticket ticket  = new Ticket();
        ticket.setGate(entryGate);
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setEntryTime(new Date().toString());
        ticket.setParkingSpot(availableSpot);
        ticket.setVehicle(vehicle);

        return  ticket;
    }

    public void updateParkingSpotStatus(ParkingLot parkingLot, ParkingSpot parkingSpot){
        for(ParkingFloor parkingFloor: parkingLot.getParkingFloors()){
            for(ParkingSpot spot : parkingFloor.getParkingSpots()){
                if(spot.equals(parkingSpot)){
                    if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)){
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.UNAVAILABLE);
                    }else{
                        parkingSpot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
                    }
                }
            }
        }

        parkingLotRepository.update(parkingLot);
    }
}
