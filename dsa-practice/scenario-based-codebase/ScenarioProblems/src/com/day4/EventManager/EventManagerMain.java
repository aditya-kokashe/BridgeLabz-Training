package com.day4.EventManager;


public class EventManagerMain {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1200),
            new Ticket(450),
            new Ticket(800),
            new Ticket(300),
            new Ticket(2000),
            new Ticket(600)
        };

        EventManager.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Cheapest Tickets:");
        for (int i = 0; i < 3; i++)
            System.out.println(tickets[i].price);
    }
}
