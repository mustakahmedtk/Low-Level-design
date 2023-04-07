package com.collection.LowLevelDesign.designPattern.Builder;


public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradyear;
    private double psp;
    private String batchName;
    private Student(Builder builder){
        this.id= builder.id;
        this.name = builder.name;
        this.yoe = builder.yoe;
        this.gradyear = builder.gradyear;
        this.psp = builder.psp;
        this.batchName = builder.batchName;

    }

    static Builder builder(){
        Builder b = new Builder();
        return b;
    }



     static class Builder {
         private int id;
         private String name; // name should not be null
         private int yoe; // >=1
         private int gradyear; // <2023
         private double psp;
         private String batchName;

         public Builder setId(int id) {
             this.id = id;
             return this;
         }

         public Builder setName(String name) {
             this.name = name;
             return this;
         }

         public Builder setYoe(int yoe) {
             this.yoe = yoe;
             return this;
         }

         public Builder setGradyear(int gradyear) {
             this.gradyear = gradyear;
             return this;
         }

         public Builder setPsp(double psp) {
             this.psp = psp;
             return this;
         }

         public Builder setBatchName(String batchName) {
             this.batchName = batchName;
             return this;
         }

         public void validate(){
             if(name == null){
                 System.out.println("name is invalid");
                 return;
             }
             if(yoe<1){
                 System.out.println("invalid year");
                 return;
             }
             if(gradyear>=2023){
                 System.out.println("grad year is invalid");
                 return;
             }
         }
         public Student build(){
             this.validate();
             Student s = new Student(this);
             return s;
         }



    }
}
