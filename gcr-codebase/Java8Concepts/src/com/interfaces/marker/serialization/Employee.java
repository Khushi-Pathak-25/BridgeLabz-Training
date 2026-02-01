package com.interfaces.marker.serialization;

public class Employee implements Backupable {
    private static final long serialVersionUID = 1L;

    private String empId;
    private String name;
    private double salary;
    private String department;

    // constructor
    public Employee(String empId, String name, double salary, String department) {
	this.empId = empId;
	this.name = name;
	this.salary = salary;
	this.department = department;
    }

    // good string representation
    @Override
    public String toString() {
	return "Employee[ID=" + empId + ", Name=" + name + ", Salary=Rs." + salary + ", Dept=" + department + "]";
    }
}