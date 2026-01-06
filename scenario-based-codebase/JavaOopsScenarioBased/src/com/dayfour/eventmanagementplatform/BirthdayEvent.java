package com.dayfour.eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(int eventId, String eventName, String location,
                          String date, int attendees, double venueCost,
                          double serviceCost, double discount, User organizer) {
        super(eventId, eventName, location, date, attendees,
              venueCost, serviceCost, discount, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event scheduled !");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday Event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday Event cancelled.");
    }
}

