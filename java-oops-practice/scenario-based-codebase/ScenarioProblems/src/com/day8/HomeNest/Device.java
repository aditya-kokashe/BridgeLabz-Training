package com.day8.HomeNest;

public abstract class Device implements IControllable {

    private String deviceId;
    private boolean status;
    protected double energyUsage;

    private String firmwareLog; // secured

    public Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware v1.0";
    }

    protected void updateFirmware(String log) {
        firmwareLog = log;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double calculateEnergy(double hours) {
        return energyUsage * hours; // operator usage
    }
}