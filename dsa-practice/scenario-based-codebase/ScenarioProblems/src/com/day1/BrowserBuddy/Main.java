package com.day1.BrowserBuddy;

public class Main {

    public static void main(String[] args) {

        BrowserHistory browser = new BrowserHistory();

        browser.visit("google.com");
        browser.visit("github.com");
        browser.visit("stackoverflow.com");

        browser.back();
        browser.closeTab();
        browser.reopenTab();
    }
}