package com.streamapi.stockpricelogger;

import java.util.Arrays;
import java.util.List;

public class StockPriceLoggerMain {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(2450.50, 2462.75, 2440.30, 2475.90);

        stockPrices.forEach(price ->
                System.out.println("Stock Price Update: " + price)
        );
    }
}
