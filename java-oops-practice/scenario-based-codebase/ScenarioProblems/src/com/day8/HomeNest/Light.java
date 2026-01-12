package com.day8.HomeNest;

public class Light extends Device {

    public Light(String deviceId) {
        super(deviceId, 5.0);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light reset completed");
    }
}