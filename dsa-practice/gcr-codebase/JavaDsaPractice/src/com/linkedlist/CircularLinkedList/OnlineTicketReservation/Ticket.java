package com.linkedlist.CircularLinkedList.OnlineTicketReservation;

public class Ticket {
    public int id;
    public String customer;
    public String movie;
    public String seat;
    public String time;

    public Ticket next;

    public Ticket(int id, String customer, String movie, String seat, String time) {
        this.id = id;
        this.customer = customer;
        this.movie = movie;
        this.seat = seat;
        this.time = time;
        this.next = null;
    }
}
