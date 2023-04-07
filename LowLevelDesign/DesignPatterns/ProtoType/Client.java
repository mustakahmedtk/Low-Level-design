package com.collection.LowLevelDesign.designPattern.ProtoType;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();

        Student aprBatch = new Student();
        aprBatch.setBatchName("Apr2022");
        aprBatch.setAvgBatchPsp(90);
        aprBatch.setInstructorName("Sandeep");
        aprBatch.setYearOfEnrollment(2022);

        Student mayBatch = new Student();
        mayBatch.setBatchName("May2022");
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setInstructorName("Naman");
        mayBatch.setYearOfEnrollment(2022);

        Student juneBatch = new Student();
        juneBatch.setBatchName("June2022");
        juneBatch.setAvgBatchPsp(92);
        juneBatch.setInstructorName("Tarun");
        juneBatch.setYearOfEnrollment(2022);

        studentRegistry.save(aprBatch);
        studentRegistry.save(mayBatch);
        studentRegistry.save(juneBatch);
        // student of april batch
        Student aprBatchRegistry = studentRegistry.get("Apr2022");
        Student raj = aprBatchRegistry.clone();
        raj.setId(1);
        raj.setAge(25);
        raj.setName("Raj");

        // student of may batch
        Student mayBatchRegistry = studentRegistry.get("May2022");
        Student naveen = mayBatchRegistry.clone();
        naveen.setId(2);
        naveen.setAge(26);
        naveen.setName("naveen");


        // intelligent Student
        IntelligentStudent superBatch = new IntelligentStudent();
        superBatch.setBatchName("super2022");
        superBatch.setAvgBatchPsp(100);
        superBatch.setInstructorName("tarun");
        superBatch.setYearOfEnrollment(2022);
        studentRegistry.save(superBatch);

        IntelligentStudent superA = superBatch.clone();
        superA.setName("A");
        superA.setAge(28);
        superA.setId(9);
        superA.setIq(100);


        /*
      Create prototype objects
      Store in a registry(map)
      Get the prototype from map
      Create a clone(deepCopy) of the prototype
      Update the values, and use it
  */




    }
}
