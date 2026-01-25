package com.annotations.importantmethod;

public class ServiceTasks {

    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment");
    }

    @ImportantMethod(level = "CRITICAL")
    public void generateInvoice() {
        System.out.println("Generating invoice");
    }

    public void normalTask() {
        System.out.println("Normal task");
    }
}