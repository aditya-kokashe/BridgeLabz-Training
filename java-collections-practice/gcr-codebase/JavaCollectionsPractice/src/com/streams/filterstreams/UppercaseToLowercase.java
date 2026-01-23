package com.streams.filterstreams;

import java.io.*;

public class UppercaseToLowercase {
    public static void main(String[] args) {
        String sourceFile = "src/com/streams/filterstreams/input.txt";
        String destinationFile = "src/com/streams/filterstreams/output.txt";

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            br = new BufferedReader(new FileReader(sourceFile));
            bw = new BufferedWriter(new FileWriter(destinationFile));

            String line;

            while ((line = br.readLine()) != null) {
                bw.write(line.toLowerCase());
                bw.newLine();
            }

            System.out.println("File converted to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("Error while processing the file.");
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) bw.close();
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}
