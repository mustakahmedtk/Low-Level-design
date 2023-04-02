package com.collection.LowLevelDesign.designPattern.Singleton;

public class Client {
    public static void main(String[] args) {
        SingleTon_V1 singleTonV1 = SingleTon_V1.getInstance();
        // the problem with the V1 is when multiple threads try to access the same object , it will create multiple objects
        // when such problems arise , we can use synchronization i.e lock and unlock
        SingleTon_V2 singleTonV2 = SingleTon_V2.getInstance();
        // lock and unlock can make the process very slow and we need to be very clear where we are using the lock and unlock
        // We can solve this problem by using the lock and unlock at the right place
        // this process is called Double check locking
        SingleTon_V3 singleTonV3 = SingleTon_V3.getInstance();

    }
}
