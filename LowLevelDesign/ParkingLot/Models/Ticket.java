package ParkingLot.Models;

public class Ticket extends BaseModel{
    private String entryTime;
    private Vehicle vehicle;

    private ParkingSpot parkingSpot;

    private Operator generatedBy;

    private EntryGate gate;

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public EntryGate getGate() {
        return gate;
    }

    public void setGate(EntryGate gate) {
        this.gate = gate;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "\n  vehicleNumber = '" + (vehicle != null ? vehicle.getNumber() : "null") + '\'' +
                ",\n  vehicleType = '" + (vehicle != null ? vehicle.getVehicleType() : "null") + '\'' +
                ",\n  entryGate = " + (gate != null ? gate.getNumber() : "null") +
                ",\n  parkingSpot = " + (parkingSpot != null ? parkingSpot.getSpotNumber() : "null") +
                ",\n  entryTime = '" + entryTime + '\'' +
                "\n}";
    }

}
