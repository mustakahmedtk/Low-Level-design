package com.collection.LowLevelDesign.designPattern.Adapter;

public interface BankApiAdapter {
     double checkBalance();
     boolean authenticate();
     boolean transaction();
}
