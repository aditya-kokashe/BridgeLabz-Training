package com.day9.MedWarehouse;

public class Medicine {

    String name;
    int expiryDays; 

    public Medicine(String name, int expiryDays) {
        this.name = name;
        this.expiryDays = expiryDays;
    }

    @Override
    public String toString() {
        return name + " - Expiry in days: " + expiryDays;
    }
}