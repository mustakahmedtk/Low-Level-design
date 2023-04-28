package com.collection.LowLevelDesign.designPattern.Decorator;

public class ChocolateScoop implements IceCream{
    private IceCream iceCream;

    public ChocolateScoop(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return this.iceCream.getCost()+30;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription()+"ChocolateScoop";
    }
}
