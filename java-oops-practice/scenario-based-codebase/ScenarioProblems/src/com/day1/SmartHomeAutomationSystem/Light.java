package com.day1.SmartHomeAutomationSystem;

public class Light extends Appliance {

    public Light() {
        super(20);   // default
    }

    @Override
    public void turnOn() {
        setPower(true);
        System.out.println("Light turned ON (20W)");
    }

    @Override
    public void turnOff() {
        setPower(false);
        System.out.println("Light turned OFF");
    }
}
