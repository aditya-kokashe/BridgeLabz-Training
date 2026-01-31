package com.csvdatahandling.validatecsvdata;

import java.io.*;
import java.util.regex.*;

public class ValidateCSVData {

    public static void main(String[] args) {

        String filePath = "src/com/csvdatahandling/validatecsvdata/employees.csv";

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line = br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                boolean emailValid = emailPattern.matcher(data[2]).matches();
                boolean phoneValid = phonePattern.matcher(data[3]).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid Row: " + line);

                    if (!emailValid) {
                        System.out.println("Invalid Email");
                    }
                    if (!phoneValid) {
                        System.out.println("Invalid Phone Number");
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
