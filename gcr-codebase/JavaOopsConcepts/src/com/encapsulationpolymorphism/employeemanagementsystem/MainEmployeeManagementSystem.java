/*1. Employee Management System
Description: Build an employee management system with the following requirements:
Use an abstract class Employee with fields like employeeId, name, and baseSalary.
Provide an abstract method calculateSalary() and a concrete method displayDetails().
Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or
fixed salary.
Use encapsulation to restrict direct access to fields and provide getter and setter methods.
Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
*/

package com.encapsulationpolymorphism.employeemanagementsystem;

import java.util.*;

public class MainEmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEmployee " + i);
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Employee Type (1-FullTime, 2-PartTime): ");
            int type = sc.nextInt();

            Employee emp;

            if (type == 1) {
                System.out.print("Enter Fixed Salary: ");
                double salary = sc.nextDouble();
                emp = new FullTimeEmployee(id, name, salary);

            } else {
                System.out.print("Enter Hours Worked: ");
                int hours = sc.nextInt();

                System.out.print("Enter Hourly Rate: ");
                double rate = sc.nextDouble();
                emp = new PartTimeEmployee(id, name, hours, rate);
            }

            emp.assignDepartment(dept);
            employees.add(emp);
        }

        // Display all employees
        System.out.println("\n====== Employee Report ======");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        sc.close();
    }
}
