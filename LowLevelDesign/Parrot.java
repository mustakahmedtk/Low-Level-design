package com.collection.LowLevelDesign;

public class Parrot extends Bird implements Flyable, Dancable, Soundable{
    public void makeSound() {
        System.out.println("Parrot is making sound");
    }

    public void dance() {
        System.out.println("Parrot is dancing");
    }

    public void fly() {
        System.out.println("Parrot is flying");
    }
}
