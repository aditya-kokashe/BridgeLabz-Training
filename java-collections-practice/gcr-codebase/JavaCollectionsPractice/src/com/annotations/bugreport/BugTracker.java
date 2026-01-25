package com.annotations.bugreport;

public class BugTracker {

    @BugReport(description = "NullPointerException occurs on login")
    @BugReport(description = "UI breaks on mobile view")
    public void loginFeature() {
        System.out.println("Login feature executed");
    }
}