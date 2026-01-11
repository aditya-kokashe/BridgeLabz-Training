package com.day1.AmbulanceRoute;

public class HospitalUnit {
    String name;
    boolean available;
    HospitalUnit next;

    public HospitalUnit(String name, boolean available) {
        this.name = name;
        this.available = available;
    }
}