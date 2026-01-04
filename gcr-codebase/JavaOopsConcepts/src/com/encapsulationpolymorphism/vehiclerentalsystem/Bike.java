package com.encapsulationpolymorphism.vehiclerentalsystem;

class Bike extends Vehicle implements Insurable {

	// Sensitive information
    private String insurancePolicyNumber;

    public Bike(String number, double rate, String policyNumber) {
        super(number, "Bike", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}

