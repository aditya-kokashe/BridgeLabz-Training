package com.functionalinterface.temperaturealert;

import java.util.function.Predicate;

public class TemperatureAlertMain {

    public static void main(String[] args) {

        double threshold = 37.5;
        double currentTemperature = 38.2;

        Predicate<Double> temperatureAlert =
                temp -> temp > threshold;

        if (temperatureAlert.test(currentTemperature)) {
            System.out.println("Temperature crossed the threshold");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
