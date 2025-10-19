package ParkingLot.Models;

public class ElectricParkingSpot extends ParkingSpot {

    private ElectricCharger electricCharger;

    public ElectricParkingSpot(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}
