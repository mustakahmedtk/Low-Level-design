package com.collection.LowLevelDesign.designPattern.Decorator;

public class ChocoChip implements IceCream{
    private IceCream iceCream;

    public ChocoChip(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return this.iceCream.getCost()+15;
    }

    @Override
    public String getDescription() {
        return this.iceCream.getDescription()+"ChocoChip";
    }
}
