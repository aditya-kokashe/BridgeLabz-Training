package com.regex.validateipaddress;

public class IPAddressValidatorMain {

    public static void main(String[] args) {

        String[] ips = {
                "192.168.1.1",
                "255.255.255.255",
                "256.1.1.1",
                "192.168.1"
        };

        for (String ip : ips) {
            System.out.println(
                    ip + " → " +
                    (IPAddressValidator.isValid(ip)
                            ? "Valid"
                            : "Invalid")
            );
        }
    }
}
