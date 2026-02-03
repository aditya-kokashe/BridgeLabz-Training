package com.functionalinterface.dataexport;

public class UserReport implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("\nUser report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("User report exported to PDF");
    }
}
