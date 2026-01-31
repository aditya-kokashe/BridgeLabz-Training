package com.iplcensor.service;

public class CensorService {

    // Mask team name: keep first word, replace rest
    public static String maskTeamName(String team) {
        if (team == null || team.isEmpty()) return team;
        String[] parts = team.split(" ");
        return parts[0] + " ***";
    }

    // Redact player name
    public static String redactPlayer() {
        return "REDACTED";
    }
}
