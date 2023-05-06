package com.collection.LowLevelDesign.designPattern.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    private static BikePathCalculator instance;

    @Override
    public void findPath(String source, String destination) {
        System.out.println("path from source to destination using bike");
    }

    public static BikePathCalculator getInstance(){
        if(instance == null){
            synchronized (BikePathCalculator.class){
                if(instance == null){
                    instance = new BikePathCalculator();
                }
            }
        }
        return instance;
    }
}
