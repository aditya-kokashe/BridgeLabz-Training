package com.day1.SmartHomeAutomationSystem;

public class AC extends Appliance {

    public AC() {
        super(1500);
    }

    @Override
    public void turnOn() {
        setPower(true);
        System.out.println("AC cooling started (1500W)");
    }

    @Override
    public void turnOff() {
        setPower(false);
        System.out.println("AC turned OFF");
    }
}
