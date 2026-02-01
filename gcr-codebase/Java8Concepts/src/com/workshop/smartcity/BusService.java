package com.workshop.smartcity;

class BusService implements TransportService {

    public String getServiceName() { return "Bus"; }
    public String getRoute() { return "A-B"; }
    public double getFare() { return 30; }
    public int getDepartureTime() { return 15; }
}