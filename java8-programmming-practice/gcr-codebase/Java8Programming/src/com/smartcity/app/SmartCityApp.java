package com.smartcity.app;

import java.util.*;
import java.util.stream.Collectors;

import com.smartcity.functional.FareCalculator;
import com.smartcity.marker.EmergencyService;
import com.smartcity.model.Passenger;
import com.smartcity.service.TransportService;
import com.smartcity.service.impl.*;

public class SmartCityApp {

    public static void main(String[] args) {

        System.out.println("Smart City Transport System Started\n");

        /* ---------------- Transport Services ---------------- */

        List<TransportService> services = Arrays.asList(
            new BusService("A-B", 30, 540),
            new BusService("A-C", 60, 510),
            new AmbulanceService()
        );

        /* ---------------- 1. Lambda Filtering & Sorting ---------------- */

        System.out.println("Available Services (Cheapest First):");

        services.stream()
                .filter(s -> s.getFare() <= 50)
                .sorted(Comparator.comparingInt(TransportService::getDepartureTime))
                .forEach(TransportService::printServiceDetails);

        /* ---------------- 2. Dashboard Update (forEach) ---------------- */

        System.out.println("\nLive Dashboard Update:");
        services.forEach(s ->
            System.out.println("Service Active: " + s.getServiceName())
        );

        /* ---------------- 3. Functional Interface (Fare Calculator) ---------------- */

        FareCalculator taxiFare = distance -> distance * 12;
        System.out.println("\nTaxi Fare for 10 km: ₹" + taxiFare.calculateFare(10));

        /* ---------------- 4. Passenger Analytics (Streams + Collectors) ---------------- */

        List<Passenger> passengers = Arrays.asList(
            new Passenger("A-B", 30, true),
            new Passenger("A-B", 30, false),
            new Passenger("B-C", 40, true),
            new Passenger("A-D", 120, false)
        );

        // Grouping by Route
        Map<String, List<Passenger>> passengersByRoute =
                passengers.stream()
                          .collect(Collectors.groupingBy(Passenger::getRoute));

        System.out.println("\nPassengers Grouped by Route:");
        passengersByRoute.forEach((route, list) ->
            System.out.println(route + " -> " + list.size() + " passengers")
        );

        // Partitioning Peak / Non-Peak
        Map<Boolean, List<Passenger>> peakPartition =
                passengers.stream()
                          .collect(Collectors.partitioningBy(Passenger::isPeakTime));

        System.out.println("\nPeak Time Trips: " + peakPartition.get(true).size());
        System.out.println("Non-Peak Trips: " + peakPartition.get(false).size());

        // Revenue Summary
        DoubleSummaryStatistics revenueStats =
                passengers.stream()
                          .collect(Collectors.summarizingDouble(Passenger::getFare));

        System.out.println("\nRevenue Report:");
        System.out.println("Total Revenue: ₹" + revenueStats.getSum());
        System.out.println("Average Fare: ₹" + revenueStats.getAverage());

        /* ---------------- 5. Marker Interface Check ---------------- */

        System.out.println("\nEmergency Service Detection:");
        services.forEach(service -> {
            if (service instanceof EmergencyService) {
                System.out.println(service.getServiceName() + " → PRIORITY GRANTED");
            }
        });

        System.out.println("\nSmart City System Running Successfully");
    }
}
