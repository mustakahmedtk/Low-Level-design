package com.collection.LowLevelDesign.designPattern.Adapter;

import com.collection.LowLevelDesign.designPattern.Adapter.BankPlatforms.YesBankAPI;

public class YesBankAPIAdapter implements BankApiAdapter{

    private YesBankAPI yesBankAPI;

    YesBankAPIAdapter(){
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double checkBalance() {
        return this.yesBankAPI.checkBalance();
    }

    @Override
    public boolean authenticate() {
        return this.yesBankAPI.authenticateUser();
    }

    @Override
    public boolean transaction() {
        return yesBankAPI.transaction();
    }
}
