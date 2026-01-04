package com.linkedlist.DoublyLinkedList.UndoRedoFunctionality;

public class TextState {
    public String text;

    public TextState next;
    public TextState prev;

    public TextState(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}
