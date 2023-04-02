package com.collection.LowLevelDesign.designPattern.Singleton;

public class SingleTon_V1 {
    /*
      create a public static method that calls the constructor internally and returns the object
     */
    private  static SingleTon_V1  instance  = null;
    private SingleTon_V1(){

    }

    public static SingleTon_V1  getInstance(){
         if(instance == null) return new SingleTon_V1();
         return instance;
    }
}
