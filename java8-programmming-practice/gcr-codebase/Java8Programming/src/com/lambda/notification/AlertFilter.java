package com.lambda.notification;

import java.util.*;
import java.util.function.Predicate;

public class AlertFilter {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Emergency", "Heart rate abnormal"),
                new Alert("General", "Appointment reminder"),
                new Alert("Emergency", "Blood pressure critical")
        );

        Predicate<Alert> emergencyOnly =
                alert -> alert.type.equalsIgnoreCase("Emergency");

        System.out.println("Emergency Alerts:");
        alerts.stream()
              .filter(emergencyOnly)
              .forEach(System.out::println);
    }
}
