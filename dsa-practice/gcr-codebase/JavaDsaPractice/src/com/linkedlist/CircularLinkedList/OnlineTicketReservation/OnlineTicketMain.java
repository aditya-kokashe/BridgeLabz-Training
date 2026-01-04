package com.linkedlist.CircularLinkedList.OnlineTicketReservation;

public class OnlineTicketMain {
    public static void main(String[] args) {

        TicketSystem ts = new TicketSystem();

        ts.addTicket(1, "Rahul", "Avatar", "A1", "10:00 AM");
        ts.addTicket(2, "Neha", "Avatar", "A2", "10:05 AM");
        ts.addTicket(3, "Aman", "Barbie", "B1", "10:15 AM");

        ts.showTickets();
        ts.searchByMovie("Avatar");

        ts.removeTicket(2);

        ts.showTickets();
        ts.countTickets();
    }
}
