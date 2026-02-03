package com.functionalinterface.sensitivedata;

public class AccountDetails implements SensitiveData {

    private String accountNumber;
    private String ifscCode;

    public AccountDetails(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    @Override
    public String toString() {
        return "AccountDetails [accountNumber=****, ifscCode=****]";
    }
}
