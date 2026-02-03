package com.functionalinterface.dataexport;

public class SalesReport implements DataExporter {

    @Override
    public void exportToCSV() {
        System.out.println("\nSales report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}
