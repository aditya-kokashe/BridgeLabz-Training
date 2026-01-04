package com.linkedlist.DoublyLinkedList.UndoRedoFunctionality;

public class UndoRedoMain {
    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World Java");
        editor.type("Hello World Java DSA");

        editor.show();

        editor.undo();
        editor.show();

        editor.undo();
        editor.show();

        editor.redo();
        editor.show();

        editor.type("Hello World Java DSA LinkedList");
        editor.show();
    }
}
