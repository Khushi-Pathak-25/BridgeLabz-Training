package com.dayfour.eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String eventName, String location,
                            String date, int attendees, double venueCost,
                            User organizer) {
        super(eventId, eventName, location, date, attendees, venueCost, organizer);
    }

    @Override
    public void schedule() {
        System.out.println(" Conference scheduled with speakers.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference Event cancelled.");
    }
}
