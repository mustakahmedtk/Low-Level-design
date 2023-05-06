package com.collection.LowLevelDesign.designPattern.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    private static WalkPathCalculator instance;

    @Override
    public void findPath(String source, String destination) {
        System.out.println("path from source to destination by walking");
    }

    public static WalkPathCalculator getInstance(){
        if(instance == null){
            synchronized (WalkPathCalculator.class){
                if(instance == null){
                    instance = new WalkPathCalculator();
                }
            }
        }
        return instance;
    }
}
