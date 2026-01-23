package com.day10.TicketAVL;

public class EventNode {
    int time;
    String eventName;
    int height;
    EventNode left, right;

    public EventNode(int time, String eventName) {
        this.time = time;
        this.eventName = eventName;
        this.height = 1;
    }
}