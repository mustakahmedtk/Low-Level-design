package ParkingLot.Models;

public abstract class BaseModel {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
