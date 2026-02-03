package com.functionalinterface.sensitivedata;

public class SensitiveDataMain {

    public static void main(String[] args) {

        AccountDetails account =
                new AccountDetails("1234567890", "SBIN0001234");

        String normalData = "Public Information";

        EncryptionProcessor.process(account);
        EncryptionProcessor.process(normalData);
    }
}
