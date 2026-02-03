package com.functionalinterface.backup;

public class BackupMain {

    public static void main(String[] args) {

        UserData user = new UserData("Abhinav", "abhinav@mail.com");
        String normalObject = "Just a String";

        BackupProcessor.performBackup(user);
        BackupProcessor.performBackup(normalObject);
    }
}
