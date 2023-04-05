package com.collection.LowLevelDesign.designPattern.Singleton;

public class SingleTon_V3 {
    private static SingleTon_V3 instance = null;
    private SingleTon_V3(){

    }
    // we can add the lock where exactly the instance is getting created
    public static SingleTon_V3 getInstance(){
        // Double Check Locking Technique
        if(instance == null){
            synchronized (SingleTon_V3.class){
                if(instance == null){
                    return new SingleTon_V3();
                }
            }
        }
        return instance;
    }
}
