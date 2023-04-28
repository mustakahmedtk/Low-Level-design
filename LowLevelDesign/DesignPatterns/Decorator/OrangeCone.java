package com.collection.LowLevelDesign.designPattern.Decorator;

public class OrangeCone implements IceCream{
    private IceCream iceCream;

    public OrangeCone(){

    }

    public OrangeCone(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if(this.iceCream == null){
            return 15;
        }
        return this.iceCream.getCost()+15;
    }

    @Override
    public String getDescription() {
        if(this.iceCream == null) return "OrangeCone";
        return this.iceCream.getDescription()+"OrangeCone";
    }
}
