package com.generics.resumescreening;

//Generic Resume class
//T must be a JobRole or its subclass
public class Resume<T extends JobRole> {

 private String candidateName;
 private T jobRole;

 // Constructor
 public Resume(String candidateName, T jobRole) {
     this.candidateName = candidateName;
     this.jobRole = jobRole;
 }

 // Process resume based on job role
 public void processResume() {
     System.out.println("Candidate: " + candidateName);
     jobRole.screenResume();   // Polymorphism
 }

 // Getter
 public T getJobRole() {
     return jobRole;
 }
}

