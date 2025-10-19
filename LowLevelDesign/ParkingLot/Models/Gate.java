package ParkingLot.Models;

public class Gate extends BaseModel {
    int number;
    private GateType gateType;
    private Operator operator;

    public int getNumber() {
        return number;
    }

    public GateType getGateType() {
        return gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
