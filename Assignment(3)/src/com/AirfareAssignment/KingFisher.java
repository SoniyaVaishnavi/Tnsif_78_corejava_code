package com.AirfareAssignment;

public class KingFisher implements Airfare {

    private int hours;
    private double costPerHour;

    // default constructor
    public KingFisher() {
    }

    // parameterized constructor
    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // getters and setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }


    public double calculateAmount() {
        return hours * costPerHour * 4;
    }
}

