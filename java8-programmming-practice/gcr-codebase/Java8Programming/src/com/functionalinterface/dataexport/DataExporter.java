package com.functionalinterface.dataexport;

public interface DataExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("\nExporting data to JSON format");
    }
}
