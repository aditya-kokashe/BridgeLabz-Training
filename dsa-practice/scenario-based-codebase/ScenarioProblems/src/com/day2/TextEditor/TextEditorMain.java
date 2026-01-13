package com.day2.TextEditor;

public class TextEditorMain {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.insert("Hello");
        editor.display();

        editor.insert("World");
        editor.display();

        editor.undo();
        editor.display();
        editor.redo();
        editor.display();
        
    }
}