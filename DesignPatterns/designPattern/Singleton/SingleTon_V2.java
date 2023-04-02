package com.collection.LowLevelDesign.designPattern.Singleton;

public class SingleTon_V2 {
    private static  SingleTon_V2 instance = null;
    private SingleTon_V2(){

    }
    // With synchronized, we can lock the getInstance method when a thread is already using it and unlock when the use is complete
    public static synchronized SingleTon_V2 getInstance(){
        if(instance == null) return new SingleTon_V2();
        return instance;
    }
}
