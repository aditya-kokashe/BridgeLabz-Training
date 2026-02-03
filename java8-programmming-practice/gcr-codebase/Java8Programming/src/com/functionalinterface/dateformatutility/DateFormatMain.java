package com.functionalinterface.dateformatutility;

import java.time.LocalDate;

public class DateFormatMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("DD-MM-YYYY -> " +
                DateUtils.formatDate(today, "dd-MM-yyyy"));

        System.out.println("YYYY/MM/DD -> " +
                DateUtils.formatDate(today, "yyyy/MM/dd"));

        System.out.println("Month DD, YYYY -> " +
                DateUtils.formatDate(today, "MMMM dd, yyyy"));
    }
}
