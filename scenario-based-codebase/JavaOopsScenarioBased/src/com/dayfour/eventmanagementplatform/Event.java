package com.dayfour.eventmanagementplatform;

public abstract class Event implements ISchedulable {

    private final int eventId;  // cannot be modified once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    // pricing (encapsulated)
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Constructor without services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, User organizer) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
    }

    // Constructor with catering/decoration services
    public Event(int eventId, String eventName, String location, String date,
                 int attendees, double venueCost, double serviceCost,
                 double discount, User organizer) {
        this(eventId, eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }
}
