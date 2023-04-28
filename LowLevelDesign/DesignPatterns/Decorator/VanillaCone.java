package com.collection.LowLevelDesign.designPattern.Decorator;

public class VanillaCone implements IceCream{
    private IceCream iceCream;
    public VanillaCone(){

    }

    public VanillaCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(this.iceCream == null){
            return 10;
        }
        return this.iceCream.getCost()+10;
    }

    @Override
    public String getDescription() {
        if(this.iceCream == null){
            return "VanillaCone";
        }
        return this.iceCream.getDescription()+"VanillaCone";
    }
}
