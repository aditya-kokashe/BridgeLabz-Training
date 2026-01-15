package com.day4.ZipZipMart;

public class ZipZipMartMain {
    public static void main(String[] args) {

        Transaction[] records = {
            new Transaction("2026-01-10", 2000),
            new Transaction("2026-01-08", 500),
            new Transaction("2026-01-10", 1000),
            new Transaction("2026-01-09", 1500),
            new Transaction("2026-01-08", 300)
        };

        ZipZipMart.mergeSort(records, 0, records.length - 1);

        System.out.println("Sorted Sales Report:");
        for (Transaction t : records) {
            System.out.println(t.date + "  " + t.amount);
        }
    }
}
