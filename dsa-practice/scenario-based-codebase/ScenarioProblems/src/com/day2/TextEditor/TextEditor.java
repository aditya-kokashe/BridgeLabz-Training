package com.day2.TextEditor;

import java.util.Stack;

public class TextEditor {

    private Stack<String> Stack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void insert(String text) {
        Stack.push(text);
        redoStack.clear();
        System.out.println("\nInserted: " + text);
    }

    public void undo() {
        if (!Stack.isEmpty()) {
            String action = Stack.pop();
            redoStack.push(action);
            System.out.println("\nUndo: " + action);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            Stack.push(action);
            System.out.println("\nRedo: " + action);
        }
    }
    
    public void display() {
    	System.out.println("\n+----------------------+");
    	System.out.println("Stack: "+ Stack);
    	System.out.println("Redo stack: "+ redoStack);
    	System.out.println("+----------------------+");
    }
}