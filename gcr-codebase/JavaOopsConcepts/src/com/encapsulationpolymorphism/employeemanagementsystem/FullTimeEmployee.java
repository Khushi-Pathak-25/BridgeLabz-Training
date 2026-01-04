package com.encapsulationpolymorphism.employeemanagementsystem;

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary(); // fixed salary
    }
}

