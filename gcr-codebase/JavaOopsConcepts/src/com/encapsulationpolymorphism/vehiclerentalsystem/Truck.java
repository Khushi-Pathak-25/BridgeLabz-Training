package com.encapsulationpolymorphism.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {

	// Sensitive information
    private String insurancePolicyNumber;

    public Truck(String number, double rate, String policyNumber) {
        super(number, "Truck", rate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; // extra charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: ****" +
                insurancePolicyNumber.substring(insurancePolicyNumber.length() - 4);
    }
}
