package com.day1.SmartHomeAutomationSystem;

public abstract class Appliance implements Controllable {
    private boolean powerStatus;     // Encapsulated
    protected int powerUsage;        // Watt

    public Appliance(int powerUsage) {
        this.powerUsage = powerUsage;
        this.powerStatus = false;
    }

    protected void setPower(boolean status) {
        powerStatus = status;
    }

    public boolean isOn() {
        return powerStatus;
    }

    public int getPowerUsage() {
        return powerUsage;
    }
}
