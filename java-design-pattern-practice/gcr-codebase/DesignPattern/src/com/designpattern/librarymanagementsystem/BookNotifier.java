package com.designpattern.librarymanagementsystem;
import java.util.*;

public class BookNotifier {

    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyUsers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
