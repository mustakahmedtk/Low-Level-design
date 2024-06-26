package com.collection.LowLevelDesign.designPattern.Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber{
    public InvoiceGenerator(){
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData returnData = new ReturnData("Invoice");
        System.out.println("Invoice is being generated");
        return returnData;
    }
}
