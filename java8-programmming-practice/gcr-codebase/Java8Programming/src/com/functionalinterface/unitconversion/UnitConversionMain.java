package com.functionalinterface.unitconversion;

public class UnitConversionMain {

    public static void main(String[] args) {

        double km = 10;
        double kg = 5;

        System.out.println(km + " km : " + UnitConverter.kmToMiles(km) + " miles");
        System.out.println(kg + " kg : " + UnitConverter.kgToPounds(kg) + " pounds");
    }
}
