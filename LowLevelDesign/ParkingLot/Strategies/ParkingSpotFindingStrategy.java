package ParkingLot.Strategies;

import ParkingLot.Exception.ParkingLotNotAvailbleException;
import ParkingLot.Models.ParkingLot;
import ParkingLot.Models.ParkingSpot;
import ParkingLot.Models.VehicleType;

public interface ParkingSpotFindingStrategy {

    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) throws ParkingLotNotAvailbleException;
}
