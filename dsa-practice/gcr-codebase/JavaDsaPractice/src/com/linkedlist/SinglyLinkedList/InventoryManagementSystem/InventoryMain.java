package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class InventoryMain {
    public static void main(String[] args) {

        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtEnd(1, "Keyboard", 10, 750);
        inv.addAtEnd(2, "Mouse", 25, 400);
        inv.addAtBeginning(3, "Monitor", 5, 9000);
        inv.addAtPosition(2, 4, "CPU", 7, 35000);

        inv.displayAll();

        inv.searchByName("Mouse");
        inv.updateQuantity(2, 30);
        inv.totalInventoryValue();

        inv.sortByPrice(true);
        inv.displayAll();

        inv.sortByName(false);
        inv.displayAll();
    }
}
