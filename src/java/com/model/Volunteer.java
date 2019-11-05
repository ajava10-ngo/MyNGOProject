package com.model;

public class Volunteer {

    private int volunteerId;
    private int userId;

    public Volunteer() {
    }

    public Volunteer(int userId) {
        this.userId = userId;
    }

    public int getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(int volunteerId) {
        this.volunteerId = volunteerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
