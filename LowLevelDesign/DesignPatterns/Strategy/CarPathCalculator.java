package com.collection.LowLevelDesign.designPattern.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    private static CarPathCalculator instance;

    private CarPathCalculator(){

    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("path from source to destination using car");
    }

    public static CarPathCalculator getInstance(){
        if(instance == null){
            synchronized (CarPathCalculator.class){
                if(instance == null){
                    instance = new CarPathCalculator();
                }
            }
        }
        return instance;
    }

}
