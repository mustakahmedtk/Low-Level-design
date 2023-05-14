package com.collection.LowLevelDesign.designPattern.Observer;

public class ReturnData {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public ReturnData(String d){
        this.data = d;
    }
}
