package com.example.endavaapplication.mydemoapp.model;

public class Event {
    public String eventName;
    public String eventDescription;
    public String eventLocation;
    public String eventDate;
    public int image;

    public Event(String eventName, String eventDescription, String eventLocation, String eventDate, int image) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventLocation = eventLocation;
        this.eventDate = eventDate;
        this.image = image;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public String getEventDate() {
        return eventDate;
    }

    public int getImage() {
        return image;
    }
}
