package com.workshop.smartcity;

class TaxiService implements TransportService {

    public String getServiceName() { return "Taxi"; }
    public String getRoute() { return "B-C"; }
    public double getFare() { return 120; }
    public int getDepartureTime() { return 2; }
    
}