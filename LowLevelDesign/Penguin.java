package com.collection.LowLevelDesign;

public class Penguin extends Bird implements  Dancable, Soundable {

    public void makeSound() {
        System.out.println(this.getName()+" is making sound");
    }

    public void dance() {
        System.out.println(this.getName()+" is dancing");
    }
}
