package com.collection.LowLevelDesign.designPattern.Adapter;

public class PhonePe {
    private BankApiAdapter bankApiAdapter;
    PhonePe(){
        this.bankApiAdapter = new ICICIBankAPIAdapter();
                                // new YesbankAPIAdapter
    }

    public void TransferMoney(){
        // ensure user is authenticated
        // ensure enough money is available
        // proceed for transaction
        if(this.bankApiAdapter.authenticate()){
            if(this.bankApiAdapter.checkBalance()>0){
                if(this.bankApiAdapter.transaction()){
                    System.out.println("transaction is successful");
                }
            }
        }
    }
}
