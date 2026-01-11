package com.day1.BrowserBuddy;

public class TabNode {
    String url;
    TabNode prev;
    TabNode next;

    public TabNode(String url) {
        this.url = url;
    }
}