package com.csvdatahandling.encryptdecryptcsv;

import java.io.*;

public class DecryptCSV {

    public static void main(String[] args) {

        String input  = "output/employees_encrypted.csv";
        String output = "output/employees_decrypted.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(output))
        ) {
            bw.write(br.readLine()); // header
            bw.newLine();

            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");

                String email  = CryptoUtil.decrypt(d[2]);
                String salary = CryptoUtil.decrypt(d[3]);

                bw.write(d[0] + "," + d[1] + "," + email + "," + salary);
                bw.newLine();
            }

            System.out.println("CSV decrypted successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
