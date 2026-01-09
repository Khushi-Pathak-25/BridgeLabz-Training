package com.daysix.tourmate;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;
    protected double budget;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor to generate complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        // Operators: total budget calculation
        this.budget = transport.getCost() + hotel.getCost() + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }
}

