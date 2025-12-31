package com.inheritance.smartHomeDevices;

public class Thermostat extends Device{

	String temperatureSetting;
	public Thermostat(int deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting= temperatureSetting;
	}

	void displayStatus() {
		System.out.println("Device Id: "+ deviceId+"\nStatus: "+status+"\ntemperatureSetting: "+temperatureSetting);
	}
}
