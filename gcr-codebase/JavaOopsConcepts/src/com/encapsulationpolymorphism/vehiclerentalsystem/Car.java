package com.encapsulationpolymorphism.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {

    // Sensitive information
    private String insurancePolicyNumber;

    public Car(String number, double rate, String policyNumber) {
        super(number, "Car", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
