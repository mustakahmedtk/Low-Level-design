package com.collection.LowLevelDesign.designPattern.ProtoType;

public class Student implements ProtoType<Student>{

    private int id;
    private String name;
    private int age;
    private String batchName;
    private String instructorName;
    private double avgBatchPsp;
    private int yearOfEnrollment;

    public Student(){

    }

    public Student(Student student){
        this.batchName = student.batchName;
        this.instructorName = student.instructorName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.yearOfEnrollment = student.yearOfEnrollment;
    }

    @Override
    public Student clone() {
        Student studentCopy = new Student(this);
        return studentCopy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBatchName() {
        return batchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }
}
