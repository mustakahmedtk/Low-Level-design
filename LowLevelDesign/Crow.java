package com.collection.LowLevelDesign;

public class Crow extends Bird implements Flyable, Dancable, Soundable{

    public void makeSound() {
        System.out.println(this.getName()+" is making sound");
    }

    public void dance() {
        System.out.println(this.getName()+" is dancing");
    }

    public void fly() {
        System.out.println(this.getName()+" is flying");
    }
}



