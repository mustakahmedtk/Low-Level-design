package ParkingLot.Repository;

import ParkingLot.Exception.ParkingLotAlreadyExistsException;
import ParkingLot.Exception.ParkingLotNotAvailbleException;
import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    private Map<Long, ParkingLot> parkingLotMap;

    private Map<Gate, ParkingLot> gateParkingLotMap;

    public ParkingLotRepository() {
        this.parkingLotMap = new HashMap<>();
        this.gateParkingLotMap = new HashMap<>();
    }


    public ParkingLot save(ParkingLot parkingLot) throws ParkingLotAlreadyExistsException {
        if(parkingLotMap.containsKey(parkingLot.getId())){
            throw new ParkingLotAlreadyExistsException();
        }

        for(Gate gate: parkingLot.getGates()){
            gateParkingLotMap.put(gate, parkingLot);
        }
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }


    public ParkingLot get(long parkingLotId){
        return parkingLotMap.get(parkingLotId);
    }

    public ParkingLot update(ParkingLot parkingLot){
        return parkingLotMap.put(parkingLot.getId(), parkingLot);
    }

    public ParkingLot getParkingLotFromGate(Gate gate) throws ParkingLotNotAvailbleException {
        if(gateParkingLotMap.containsKey(gate)){
            return gateParkingLotMap.get(gate);
        }else {
            throw new ParkingLotNotAvailbleException();
        }
    }

    public Map<Long, ParkingLot> getParkingLotMap() {
        return parkingLotMap;
    }

    public void setParkingLotMap(Map<Long, ParkingLot> parkingLotMap) {
        this.parkingLotMap = parkingLotMap;
    }

    public Map<Gate, ParkingLot> getGateParkingLotMap() {
        return gateParkingLotMap;
    }

    public void setGateParkingLotMap(Map<Gate, ParkingLot> gateParkingLotMap) {
        this.gateParkingLotMap = gateParkingLotMap;
    }
}
