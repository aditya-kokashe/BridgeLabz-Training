package com.inheritance.smartHomeDevices;

public class DeviceMain {

	public static void main(String[] args) {
		Device a = new Thermostat(01,"Online","Normal");
		a.displayStatus();
	}

}
