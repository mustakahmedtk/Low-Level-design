package ParkingLot.Strategies;

import ParkingLot.Exception.ParkingSpotNotAvailable;
import ParkingLot.Models.*;
import ParkingLot.Services.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements  ParkingSpotFindingStrategy{

    private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;

    public RandomParkingSpotFindingStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService) {
        this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
    }

    @Override
    public ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        for (ParkingFloor parkingFloor : parkingLot.getParkingFloors()) {
            for (ParkingSpot parkingSpot : parkingFloor.getParkingSpots()) {
                if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) && parkingSpotVehicleTypeMatchingService.matches(parkingSpot.getSpotType(), vehicleType)) {
                    return parkingSpot;
                }
            }
        }
        return null;
    }
}
