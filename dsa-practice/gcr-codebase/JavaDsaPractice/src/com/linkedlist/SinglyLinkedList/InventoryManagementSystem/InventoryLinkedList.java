package com.linkedlist.SinglyLinkedList.InventoryManagementSystem;

public class InventoryLinkedList {

    private InventoryNode head;
    //Add at Beginning
    public void addAtBeginning(int id, String name, int qty, double price) {
        InventoryNode node = new InventoryNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    //Add at End
    public void addAtEnd(int id, String name, int qty, double price) {
        InventoryNode node = new InventoryNode(id, name, qty, price);

        if (head == null) {
            head = node;
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    //Add at Position
    public void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos == 1) {
            addAtBeginning(id, name, qty, price);
            return;
        }

        InventoryNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(" Invalid Position!");
            return;
        }

        InventoryNode node = new InventoryNode(id, name, qty, price);
        node.next = temp.next;
        temp.next = node;
    }

    //Remove by Item ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println(" Inventory Empty!");
            return;
        }

        if (head.itemId == id) {
            head = head.next;
            System.out.println(" Item Removed.");
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println(" Item Not Found!");
        }else {
            temp.next = temp.next.next;
            System.out.println(" Item Removed.");
        }
    }

    //Update Quantity
    public void updateQuantity(int id, int newQty) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                System.out.println(" Quantity Updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Item Not Found!");
    }

    //Search by ID
    public void searchById(int id) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Item Not Found!");
    }

    //Search by Name
    public void searchByName(String name) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Item Not Found!");
    }

    //Display All
    public void displayAll() {
        InventoryNode temp = head;
//        System.out.println("\nID | Name | Qty | Price");
        System.out.println("+--------------------------------------------------+");
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    private void displayItem(InventoryNode n) {
        System.out.println(" ID: "+n.itemId + "\tName: " + n.itemName + "\tQty: " + n.quantity + "\t  Price: " + n.price);
    }

    //Total Inventory Value
    public void totalInventoryValue() {
        double total = 0;
        InventoryNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println(" Total Inventory Value : " + total);
    }

    //SORT by Name
    public void sortByName(boolean asc) {
        head = mergeSort(head, asc, true);
        System.out.println(" \n Sorted by Name");
    }

    //SORT by Price
    public void sortByPrice(boolean asc) {
        head = mergeSort(head, asc, false);
        System.out.println(" \n Sorted by Price");
    }

    private InventoryNode mergeSort(InventoryNode node, boolean asc, boolean byName) {
        if (node == null || node.next == null) return node;

        InventoryNode mid = getMiddle(node);
        InventoryNode nextMid = mid.next;
        mid.next = null;

        InventoryNode left = mergeSort(node, asc, byName);
        InventoryNode right = mergeSort(nextMid, asc, byName);

        return merge(left, right, asc, byName);
    }

    private InventoryNode merge(InventoryNode a, InventoryNode b, boolean asc, boolean byName) {
        if (a == null) return b;
        if (b == null) return a;

        boolean condition;
        if (byName) {
            condition = asc ? a.itemName.compareToIgnoreCase(b.itemName) <= 0
                            : a.itemName.compareToIgnoreCase(b.itemName) > 0;
        }else {
            condition = asc ? a.price <= b.price : a.price > b.price;
        }
        InventoryNode result;
        if (condition) {
            result = a;
            result.next = merge(a.next, b, asc, byName);
        } else {
            result = b;
            result.next = merge(a, b.next, asc, byName);
        }
        return result;
    }

    private InventoryNode getMiddle(InventoryNode node) {
        if (node == null) {
        	return node;
        }
        InventoryNode slow = node, fast = node.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
