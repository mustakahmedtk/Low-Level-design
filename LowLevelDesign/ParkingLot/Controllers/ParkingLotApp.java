package ParkingLot.Controllers;

import ParkingLot.Exception.ParkingLotAlreadyExistsException;
import ParkingLot.Exception.ParkingLotNotAvailbleException;
import ParkingLot.Exception.ParkingSpotNotAvailable;
import ParkingLot.Models.*;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Services.ParkingSpotVehicleTypeMatchingService;
import ParkingLot.Services.TicketService;
import ParkingLot.Strategies.ParkingSpotFindingStrategy;
import ParkingLot.Strategies.RandomParkingSpotFindingStrategy;
import ParkingLot.dto.GenerateTicketRequestDTO;
import ParkingLot.dto.ResponseDTO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLotApp {

    public static void main(String[] args) throws ParkingLotNotAvailbleException, ParkingSpotNotAvailable, ParkingLotAlreadyExistsException {

        // Step 1: Create 10 parking spots
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ParkingSpot spot = new ParkingSpot();
            spot.setSpotNumber(i); // ✅ fixed setter
            spot.setSpotType(SpotType.SMALL);
            spot.setParkingSpotStatus(ParkingSpotStatus.AVAILABLE);
            spots.add(spot);
        }

        // Step 2: Create 2 floors (5 spots each)
        List<ParkingFloor> floors = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ParkingFloor floor = new ParkingFloor();
            floor.setId((long) (i + 1));
            floor.setParkingSpots(spots.subList(i * 5, (i + 1) * 5));
            floors.add(floor);
        }

        // Step 3: Create parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setId(1L);
        parkingLot.setParkingFloors(floors);

        // Step 4: Add gates
        EntryGate entryGate1 = new EntryGate();
        entryGate1.setNumber(1);
        entryGate1.setGateType(GateType.ENTRY);

        EntryGate entryGate2 = new EntryGate();
        entryGate2.setNumber(2);
        entryGate2.setGateType(GateType.ENTRY);

        Gate exitGate = new Gate();
        exitGate.setNumber(3);
        exitGate.setGateType(GateType.EXIT);

        parkingLot.setGates(Arrays.asList(entryGate1, entryGate2, exitGate));

        // Step 5: Save parking lot in repository
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.save(parkingLot);

        // Step 6: Create ticket service and controller
        ParkingSpotVehicleTypeMatchingService matchingService = new ParkingSpotVehicleTypeMatchingService();
        ParkingSpotFindingStrategy strategy = new RandomParkingSpotFindingStrategy(matchingService);
        TicketService ticketService = new TicketService(strategy, parkingLotRepository);
        TicketController controller = new TicketController(ticketService);

        // Step 7: Create request DTO
        Vehicle vehicle = new Vehicle();
        vehicle.setNumber("KA01AB1234");
        vehicle.setVehicleType(VehicleType.MEDIUM);
        GenerateTicketRequestDTO request = new GenerateTicketRequestDTO(vehicle, entryGate1);

        // Step 8: Generate ticket
        ResponseDTO response = controller.getTicket(request);
        System.out.println(response);
    }
}
