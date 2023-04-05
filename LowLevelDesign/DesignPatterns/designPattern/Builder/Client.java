package com.collection.LowLevelDesign.designPattern.Builder;

public class Client {
    public static void main(String[] args) {
        Student s = Student.builder()
                .setId(1)
                .setGradyear(2022)
                .setName("mustak")
                .setYoe(2)
                .build();

    }

}
