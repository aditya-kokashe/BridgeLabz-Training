package com.day5.CropMonitor;

public class QuickSort {

    public static void sort(SensorData[] data, int low, int high) {
        if (low < high) {
            int pi = partition(data, low, high);
            sort(data, low, pi - 1);
            sort(data, pi + 1, high);
        }
    }

    private static int partition(SensorData[] data, int low, int high) {
        long pivot = data[high].timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (data[j].timestamp < pivot) {
                i++;
                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        SensorData temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
