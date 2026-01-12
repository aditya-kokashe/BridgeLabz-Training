package com.day2.TextEditor;

public class TextEditorMain {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.insert("World");

        editor.undo();
        editor.redo();
    }
}