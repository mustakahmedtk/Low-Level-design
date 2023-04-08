package com.collection.LowLevelDesign.designPattern.Adapter;

import com.collection.LowLevelDesign.designPattern.Adapter.BankPlatforms.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankApiAdapter{

    private ICICIBankAPI iciciBankAPI;
    ICICIBankAPIAdapter(){
        this.iciciBankAPI = new ICICIBankAPI();
    }
    @Override
    public double checkBalance() {
        return this.iciciBankAPI.queryBalance();
    }

    @Override
    public boolean authenticate() {
        if(this.iciciBankAPI.checkUser() == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean transaction() {
        if(this.iciciBankAPI.transfer() == 1){
            return true;
        }
        return false;
    }
}
