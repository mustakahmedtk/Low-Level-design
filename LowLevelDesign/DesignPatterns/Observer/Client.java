package com.collection.LowLevelDesign.designPattern.Observer;

public class Client {
    public static void main(String[] args) {
        Amazon a = Amazon.getInstance(); // publisher
        CustomerNotifier customerNotifier =  new CustomerNotifier(); // creating the subscriber and auto subscribing
        WMSNotifier wmsNotifier =  new WMSNotifier();
        InvoiceGenerator invoiceGenerator =  new InvoiceGenerator();
        a.orderPlaced();  // will notify all the subscribers
        a.deRegisterSubsriber(wmsNotifier); // will remove WMSNotifier
        a.orderPlaced(); // notify remaining subscribers


    }
}
