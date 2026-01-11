package com.day1.AmbulanceRoute;

public class AmbulanceRoute {

    private HospitalUnit head;

    public void addUnit(String name, boolean available) {
        HospitalUnit unit = new HospitalUnit(name, available);

        if (head == null) {
            head = unit;
            unit.next = head;
            return;
        }

        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = unit;
        unit.next = head;
    }

    public void findAvailableUnit() {
        if (head == null) return;

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println("Redirecting to: " + temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No unit available!");
    }

    public void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head, prev = null;
        do {
            if (curr.name.equals(name)) {
                if (prev != null)
                    prev.next = curr.next;
                if (curr == head)
                    head = curr.next;
                System.out.println(name + " removed (maintenance)");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}