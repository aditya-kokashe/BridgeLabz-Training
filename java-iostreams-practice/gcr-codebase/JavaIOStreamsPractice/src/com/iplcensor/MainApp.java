package com.iplcensor;

import com.iplcensor.json.JsonCensorReaderWriter;
import com.iplcensor.csv.CsvCensorReaderWriter;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("IPL Censor Analyzer Started");

        JsonCensorReaderWriter.processJson();
        CsvCensorReaderWriter.processCsv();

        System.out.println("Processing Completed");
    }
}
