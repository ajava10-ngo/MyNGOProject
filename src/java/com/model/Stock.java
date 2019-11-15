package com.model;

public class Stock {

    private int stockId, available;
    private String bloodGroup;
    
    public Stock() {}
    
    public Stock(int stockId, int available, String bloodGroup) {
        this.stockId = stockId;
        this.available = available;
        this.bloodGroup = bloodGroup;
    }

    public Stock(int available, String bloodGroup) {
        this.available = available;
        this.bloodGroup = bloodGroup;
    }

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
