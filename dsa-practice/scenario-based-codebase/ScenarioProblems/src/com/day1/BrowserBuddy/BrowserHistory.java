package com.day1.BrowserBuddy;

import java.util.Stack;

public class BrowserHistory {

    private TabNode current;
    private Stack<String> closedTabs = new Stack<>();

    public void visit(String url) {
        TabNode node = new TabNode(url);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }
    }

    public void forward() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        }
    }

    public void closeTab() {
        if (current != null) {
            closedTabs.push(current.url);
            System.out.println("Closed: " + current.url);
            current = current.prev;
        }
    }

    public void reopenTab() {
        if (!closedTabs.isEmpty()) {
            visit(closedTabs.pop());
        }
    }
}