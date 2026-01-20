package com.generics.resumescreening;

public class SoftwareEngineer extends JobRole {

 public SoftwareEngineer() {
     super("Software Engineer");
 }

 @Override
 public void screenResume() {
     System.out.println("Screening for coding skills and problem solving.");
 }
}
