package com.day4.EventEase;

public abstract class Event implements ISchedulable {

    private int eventId;          // cannot be modified
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;
    protected User organizer;

    private static int counter = 1000;

    public Event(String eventName, String location, String date, int attendees, User organizer) {
        this.eventId = ++counter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
    }

    public int getEventId() {
        return eventId;
    }
}
