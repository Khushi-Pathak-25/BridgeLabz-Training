package com.workshop.smartcity;

interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    int getDepartureTime(); // minutes

    // Default method
    default void printServiceDetails() {
        System.out.println(
                getServiceName() +
                " | Route: " + getRoute() +
                " | Fare: Rs." + getFare() +
                " | Departure Time: " + getDepartureTime() + " min"
        );
    }
}