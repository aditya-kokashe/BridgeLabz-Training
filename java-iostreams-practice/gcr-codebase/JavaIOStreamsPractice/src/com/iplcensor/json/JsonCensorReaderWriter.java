package com.iplcensor.json;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import org.json.JSONArray;
import org.json.JSONObject;

import com.iplcensor.service.CensorService;

public class JsonCensorReaderWriter {

    public static void processJson() {

        try {
            String inputPath = "src/com/iplcensor/json/input.json";
            String outputPath = "src/com/iplcensor/json/output_censored.json";

            String content = new String(Files.readAllBytes(Paths.get(inputPath)));
            JSONArray matches = new JSONArray(content);

            for (int i = 0; i < matches.length(); i++) {
                JSONObject match = matches.getJSONObject(i);

                // Mask team names
                String team1 = match.getString("team1");
                String team2 = match.getString("team2");

                String maskedTeam1 = CensorService.maskTeamName(team1);
                String maskedTeam2 = CensorService.maskTeamName(team2);

                match.put("team1", maskedTeam1);
                match.put("team2", maskedTeam2);

                // Update winner
                match.put("winner", CensorService.maskTeamName(match.getString("winner")));

                // Redact player
                match.put("player_of_match", CensorService.redactPlayer());

                // Update score keys
                JSONObject score = match.getJSONObject("score");
                JSONObject newScore = new JSONObject();

                Iterator<String> keys = score.keys();
                while (keys.hasNext()) {
                    String key = keys.next();
                    int value = score.getInt(key);
                    newScore.put(CensorService.maskTeamName(key), value);
                }

                match.put("score", newScore);
            }

            Files.write(Paths.get(outputPath), matches.toString(2).getBytes());
            System.out.println("Censored JSON generated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
