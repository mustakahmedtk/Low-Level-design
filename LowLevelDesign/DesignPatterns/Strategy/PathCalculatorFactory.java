package com.collection.LowLevelDesign.designPattern.Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(String mode){
        if(mode.equals(VehicleType.CAR.name())){
            return CarPathCalculator.getInstance();
        }
        else if(mode.equals(VehicleType.BIKE.name())){
            return BikePathCalculator.getInstance();
        }
        else{
            return WalkPathCalculator.getInstance();
        }
    }
}
