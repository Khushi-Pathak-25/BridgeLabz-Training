/*Classes, Objects, Constructors, Encapsulation, Method Creation, this keyword
 Scenario:
You're working at GeoMeasure Solutions, a company that builds custom software for civil
engineers and architects. One of their core requirements is to compare line segments on
blueprints to determine if they are of equal length, or which one is longer.
 Problem Statement:
Build a Java application that:
● Allows a user to input the coordinates (x1, y1, x2, y2) of two lines.
● Uses a method to calculate the length of each line.
● Compares the two lengths and prints whether they are equal, or which is longer.
● Uses encapsulation to hide the internal data of each line.
● Uses constructors to initialize line objects.
Bonus: Support multiple line comparisons and store them in a list.*/

package com.dayten.geomeasure;

import java.util.ArrayList;
import java.util.Scanner;

public class MainGeoMeasure {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Line> lines = new ArrayList<>();

		System.out.println("Enter coordinates for Line 1: ");

		Line line1 = createLine(input);

		lines.add(line1);

		System.out.println("\nEnter coordinates for Line 2: ");

		Line line2 = createLine(input);

		lines.add(line2);

		double length1 = line1.calculateLength();
		double length2 = line2.calculateLength();

		System.out.println("\nLength of Line 1: " + length1);
		System.out.println("Length of Line 2: " + length2);

		// Comparison
		if (length1 == length2) {
			System.out.println("Both lines are equal in length.");
		} else if (length1 > length2) {
			System.out.println("Line 1 is longer.");
		} else {
			System.out.println("Line 2 is longer.");
		}

		input.close();

	}

	// Helper method to create Line object
	static Line createLine(Scanner input) {

		System.out.print("Enter x1: ");
		double x1 = input.nextDouble();

		System.out.print("Enter y1: ");
		double y1 = input.nextDouble();

		System.out.print("Enter x2: ");
		double x2 = input.nextDouble();

		System.out.print("Enter y2: ");
		double y2 = input.nextDouble();

		return new Line(x1, y1, x2, y2);
	}

}
