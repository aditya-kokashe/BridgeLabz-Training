package com.inheritance.smartHomeDevices;

public class Device {

	int deviceId;
	String status;
	public Device(int deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}
	
	void displayStatus() {
		System.out.println("Device Id: "+ deviceId+"\nStatus: "+status);
	}
	

}
