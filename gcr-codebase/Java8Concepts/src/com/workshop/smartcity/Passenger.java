package com.workshop.smartcity;

class Passenger {
	
    String route;
    double fare;
    boolean peakHour;

    Passenger(String route, double fare, boolean peakHour) {
        this.route = route;
        this.fare = fare;
        this.peakHour = peakHour;
    }
}