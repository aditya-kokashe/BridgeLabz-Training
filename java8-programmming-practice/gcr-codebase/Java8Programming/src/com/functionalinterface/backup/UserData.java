package com.functionalinterface.backup;

public class UserData implements BackupEligible {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserData [username=" + username + ", email=" + email + "]";
    }
}
