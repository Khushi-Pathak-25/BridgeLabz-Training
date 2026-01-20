package com.generics.resumescreening;

public class ProductManager extends JobRole {

 public ProductManager() {
     super("Product Manager");
 }

 @Override
 public void screenResume() {
     System.out.println("Screening for leadership and product strategy skills.");
 }
}

