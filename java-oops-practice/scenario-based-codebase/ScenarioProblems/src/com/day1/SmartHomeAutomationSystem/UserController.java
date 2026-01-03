package com.day1.SmartHomeAutomationSystem;

public class UserController {

    public void controlDevice(Controllable device, boolean state) {
        if(state) device.turnOn();
        else device.turnOff();
    }

    public void compareUsage(Appliance a1, Appliance a2) {
        if(a1.getPowerUsage() > a2.getPowerUsage())
            System.out.println("First appliance uses more power");
        else if(a1.getPowerUsage() < a2.getPowerUsage())
            System.out.println("Second appliance uses more power");
        else
            System.out.println("Both use equal power");
    }
}
