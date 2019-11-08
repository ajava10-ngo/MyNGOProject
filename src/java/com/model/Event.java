package com.model;

public class Event {

    private int eventId;
    private String event = "";
    private String description = "";
    private String date = "";
    private String time = "";
    private int volunteerId = 0;
    private String location = "";
    private String sponsers = "";

    public Event() {}
    
    public Event(int eventId, String event, String description, String date, String time, int volunteerId, String location, String sponsers) {
        this.eventId = eventId;
        this.event = event;
        this.description = description;
        this.date = date;
        this.time = time;
        this.volunteerId = volunteerId;
        this.location = location;
        this.sponsers = sponsers;
    }

    public Event(String event, String description, String date, String time, int volunteerId, String location, String sponsers) {
        this.event = event;
        this.description = description;
        this.date = date;
        this.time = time;
        this.volunteerId = volunteerId;
        this.location = location;
        this.sponsers = sponsers;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSponsers() {
        return sponsers;
    }

    public void setSponsers(String sponsers) {
        this.sponsers = sponsers;
    }
}
