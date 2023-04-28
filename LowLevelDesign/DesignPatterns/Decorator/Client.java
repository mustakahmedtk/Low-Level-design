package com.collection.LowLevelDesign.designPattern.Decorator;

public class Client{
    public static void main(String[] args) {
        IceCream ic = new OrangeCone(new ChocolateScoop(new ChocoChip(new VanillaCone(new OrangeCone()))));
        System.out.println("icecream cost :"+ic.getCost());
        System.out.println("icecream description :"+ic.getDescription());
    }
}
