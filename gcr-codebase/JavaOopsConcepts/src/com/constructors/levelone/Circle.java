package com.constructors.levelone;

import java.util.Scanner;

public class Circle {

	// attribute
	double radius;
	
	// Default Constructor
    public Circle() {
        this(1.0);
    }

    // Parameterized Constructor
    public 	Circle(double radius) {
        this.radius = radius;
    }

    // method to calculate area of circle
    public double area() {
        return Math.PI * radius * radius;
    }
    
    public static void main (String [] args) {
    	
        Circle c1 = new Circle();
        System.out.println("Area (default): " + c1.area());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();
        
        Circle c2 = new Circle(radius);
        System.out.println("Area (custom): " + c2.area());
        input.close();
    
    }
	
}
