package com.streamapi.eventwelcome;

import java.util.Arrays;
import java.util.List;

public class EventWelcomeMain {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList("Nitya", "Riya", "Kapoor", "Sharma");

        attendees.forEach(name ->
                System.out.println("Welcome : " + name )
        );
    }
}
