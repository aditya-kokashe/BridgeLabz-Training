package com.linkedlist.DoublyLinkedList.UndoRedoFunctionality;

public class TextEditor {

    private TextState head = null;
    private TextState tail = null;
    private TextState current = null;

    private int size = 0;
    private final int MAX = 10;

    // Add new text state
    public void type(String newText) {

        TextState state = new TextState(newText);

        // Clear redo history
        if (current != null && current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = state;
        } else {
            tail.next = state;
            state.prev = tail;
            tail = state;
            current = state;
        }

        size++;
        if (size > MAX) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo
    public void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
        else
            System.out.println("Nothing to undo");
    }

    // Redo
    public void redo() {
        if (current != null && current.next != null)
            current = current.next;
        else
            System.out.println("Nothing to redo");
    }

    // Show current text
    public void show() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
        else
            System.out.println("No text available");
    }
}
