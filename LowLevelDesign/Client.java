package com.collection.LowLevelDesign;

public class Client {
    public static void main(String[] args){
        Crow cr = new Crow();
        cr.setName("mouri");
        Penguin pen = new Penguin();
        pen.setName("toma");
        pen.dance();
        pen.breath();
        pen.makeSound();
        cr.fly();
        cr.makeSound();
        cr.breath();



    }


}
