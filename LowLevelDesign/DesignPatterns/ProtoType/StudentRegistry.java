package com.collection.LowLevelDesign.designPattern.ProtoType;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String , Student> Registry;
    public StudentRegistry(){
        this.Registry = new HashMap<String, Student>();
    }

    public Student get(String BatchName){
        return this.Registry.get(BatchName);
    }

    public void save(Student student){
        this.Registry.put(student.getBatchName(),student);
    }
}
