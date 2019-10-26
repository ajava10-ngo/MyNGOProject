package com.model;

public class City {
    
    private int cityId, stateId;
    private String city;

    public City(int cityId, int stateId, String city) {
        this.cityId = cityId;
        this.stateId = stateId;
        this.city = city;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}