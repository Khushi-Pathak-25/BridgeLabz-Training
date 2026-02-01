package com.workshop.smartcity;

class MetroService implements TransportService {

    public String getServiceName() { return "Metro"; }
    public String getRoute() { return "A-C"; }
    public double getFare() { return 50; }
    public int getDepartureTime() { return 5; }

}
