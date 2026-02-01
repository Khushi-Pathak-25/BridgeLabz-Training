package com.interfaces.marker.cloningprototype;

public class EmployeeProfile implements Prototype {
    private String empId;
    private String name;
    private String department;
    private int experienceYears;

    // constructor
    public EmployeeProfile(String empId, String name, String department, int experienceYears) {
	this.empId = empId;
	this.setName(name);
	this.setDepartment(department);
	this.setExperienceYears(experienceYears);
    }

    // copy constructor (for deep clone)
    public EmployeeProfile(EmployeeProfile other) {
	this.empId = other.empId;
	this.setName(other.getName());
	this.setDepartment(other.getDepartment());
	this.setExperienceYears(other.getExperienceYears());
    }

    @Override
    public EmployeeProfile clone() throws CloneNotSupportedException {
	return (EmployeeProfile) super.clone();
	// shallow clone in this case (all fields are immutable/primitives or String)
    }

    public String getDepartment() {
	return department;
    }

    public void setDepartment(String department) {
	this.department = department;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getExperienceYears() {
	return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
	this.experienceYears = experienceYears;
    }

    // good string representation
    @Override
    public String toString() {
	return "Employee[ID=" + empId + ", Name=" + getName() + ", Dept=" + getDepartment() + ", Exp=" + getExperienceYears()
		+ " yrs]";
    }
}