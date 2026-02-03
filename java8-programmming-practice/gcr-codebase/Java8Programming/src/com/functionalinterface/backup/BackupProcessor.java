package com.functionalinterface.backup;

public class BackupProcessor {

    public static void performBackup(Object obj) {

        if (obj instanceof BackupEligible) {
            System.out.println("Backing up data: " + obj);
        } else {
            System.out.println("Not eligible for backup");
        }
    }
}
