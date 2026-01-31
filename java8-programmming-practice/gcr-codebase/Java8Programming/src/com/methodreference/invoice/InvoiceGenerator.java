package com.methodreference.invoice;

import java.util.*;
import java.util.stream.*;

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<String> transactions =
                Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        List<Invoice> invoices =
                transactions.stream()
                            .map(Invoice::new)   // constructor reference
                            .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
