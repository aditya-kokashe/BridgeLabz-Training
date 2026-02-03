package com.functionalinterface.dataexport;

public class ExportMain {

    public static void main(String[] args) {

        DataExporter sales = new SalesReport();
        DataExporter users = new UserReport();

        sales.exportToCSV();
        sales.exportToPDF();
        sales.exportToJSON();

        users.exportToCSV();
        users.exportToPDF();
        users.exportToJSON();
    }
}
