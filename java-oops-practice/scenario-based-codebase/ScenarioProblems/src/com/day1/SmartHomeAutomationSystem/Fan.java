package com.day1.SmartHomeAutomationSystem;

public class Fan extends Appliance {

    public Fan() {
        super(70);
    }

    @Override
    public void turnOn() {
        setPower(true);
        System.out.println("Fan running (70W)");
    }

    @Override
    public void turnOff() {
        setPower(false);
        System.out.println("Fan stopped");
    }
}
