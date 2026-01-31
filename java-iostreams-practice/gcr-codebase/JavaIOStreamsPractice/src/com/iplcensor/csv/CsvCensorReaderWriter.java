package com.iplcensor.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import com.iplcensor.service.CensorService;

public class CsvCensorReaderWriter {

    public static void processCsv() {

        String inputPath = "src/com/iplcensor/csv/input.csv";
        String outputPath = "src/com/iplcensor/csv/output_censored.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputPath));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputPath))
        ) {
            // Write header
            bw.write(br.readLine());
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                d[1] = CensorService.maskTeamName(d[1]);
                d[2] = CensorService.maskTeamName(d[2]);
                d[5] = CensorService.maskTeamName(d[5]);
                d[6] = CensorService.redactPlayer();

                bw.write(String.join(",", d));
                bw.newLine();
            }

            System.out.println("Censored CSV generated");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
