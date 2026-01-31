package com.csvdatahandling.encryptdecryptcsv;

import java.io.*;

public class EncryptCSV {

    public static void main(String[] args) {

        String input  = "output/employees_plain.csv";
        String output = "output/employees_encrypted.csv";

        new File("output").mkdirs();

        try (
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {
            bw.write(br.readLine()); // header
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                String encryptedEmail  = CryptoUtil.encrypt(d[2]);
                String encryptedSalary = CryptoUtil.encrypt(d[3]);

                bw.write(d[0] + "," + d[1] + "," + encryptedEmail + "," + encryptedSalary);
                bw.newLine();
            }

            System.out.println("CSV encrypted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
