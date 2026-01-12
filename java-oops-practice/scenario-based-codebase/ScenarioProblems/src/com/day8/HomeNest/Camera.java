package com.day8.HomeNest;

public class Camera extends Device {

    public Camera(String deviceId) {
        super(deviceId, 10.0);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera OFF");
    }

    public void reset() {
        System.out.println("Camera recalibrated");
    }
}