package com.day1.SmartHomeAutomationSystem;

public class SmartHomeMain {
    public static void main(String[] args) {

        UserController controller = new UserController();

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        controller.controlDevice(light, true);
        controller.controlDevice(ac, true);
        controller.controlDevice(fan, true);

        controller.compareUsage(light, ac);
        controller.compareUsage(fan, light);
    }
}
