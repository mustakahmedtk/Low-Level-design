package ParkingLot.Services;

import ParkingLot.Models.SpotType;
import ParkingLot.Models.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {

    public boolean matches(SpotType spotType, VehicleType vehicleType){
        return switch (spotType) {
            case LARGE -> vehicleType.equals(VehicleType.LARGE);
            case MEDIUM -> vehicleType.equals(VehicleType.MEDIUM);
            case SMALL -> vehicleType.equals(VehicleType.SMALL);
            case ELECTRIC -> vehicleType.equals(VehicleType.ELECTRIC);
        };
    }
}
