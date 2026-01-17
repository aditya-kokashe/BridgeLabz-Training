package com.day5.CropMonitor;

public class CropMonitorMain {

    public static void main(String[] args) {

        // Unordered sensor data 
        SensorData[] data = {
            new SensorData(1705123400L, 28.5),
            new SensorData(1705121200L, 26.8),
            new SensorData(1705125600L, 29.1),
            new SensorData(1705120000L, 25.9),
            new SensorData(1705124500L, 27.6)
        };

        System.out.println("Before Sorting:");
        for (SensorData d : data) {
            System.out.println(d.timestamp + " -> " + d.temperature);
        }

        QuickSort.sort(data, 0, data.length - 1);

        System.out.println("\nAfter Sorting:");
        for (SensorData d : data) {
            System.out.println(d.timestamp + " -> " + d.temperature);
        }
    }
}
