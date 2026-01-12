package com.day2.TextEditor;

import java.util.Stack;

public class TextEditor {

    private Stack<String> undoStack = new Stack<>();
    private Stack<String> redoStack = new Stack<>();

    public void insert(String text) {
        undoStack.push(text);
        redoStack.clear();
        System.out.println("Inserted: " + text);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            String action = undoStack.pop();
            redoStack.push(action);
            System.out.println("Undo: " + action);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            undoStack.push(action);
            System.out.println("Redo: " + action);
        }
    }
}