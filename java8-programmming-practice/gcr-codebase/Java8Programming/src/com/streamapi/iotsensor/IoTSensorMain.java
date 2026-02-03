package com.streamapi.iotsensor;

import java.util.Arrays;
import java.util.List;

public class IoTSensorMain {

    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(22.5, 35.2, 40.8, 28.4);
        double threshold = 30.0;

        sensorReadings.stream()
                .filter(reading -> reading > threshold)
                .forEach(reading ->
                        System.out.println("High sensor reading detected: " + reading)
                );
    }
}
