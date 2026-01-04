package com.linkedlist.CircularLinkedList.OnlineTicketReservation;

public class TicketSystem {

    private Ticket head = null;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie, String seat, String time) {
        Ticket t = new Ticket(id, customer, movie, seat, time);

        if (head == null) {
            head = t;
            t.next = head;
            return;
        }

        Ticket temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = t;
        t.next = head;
    }

    // Remove ticket by ID
    public void removeTicket(int id) {
        if (head == null) return;

        Ticket temp = head, prev = null;

        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Ticket last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }
                System.out.println(" Ticket Removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println(" Ticket Not Found");
    }

    // Search by Customer
    public void searchByCustomer(String name) {
        if (head == null) return;

        Ticket temp = head;
        do {
            if (temp.customer.equalsIgnoreCase(name))
                displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Movie
    public void searchByMovie(String movie) {
        if (head == null) return;

        Ticket temp = head;
        do {
            if (temp.movie.equalsIgnoreCase(movie))
                displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Display all tickets
    public void showTickets() {
        if (head == null) {
            System.out.println(" No Tickets Booked");
            return;
        }

        Ticket temp = head;
        System.out.println("\n ID \t Customer  Movie  Seat \t Time");
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Count tickets
    public void countTickets() {
        if (head == null) {
            System.out.println(" Total Tickets: 0");
            return;
        }

        int count = 0;
        Ticket temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println(" Total Tickets: " + count);
    }

    private void displayTicket(Ticket t) {
        System.out.println(" "+t.id + " \t " + t.customer + " \t " + t.movie +
                " \t  " + t.seat + " \t " + t.time);
    }
}
