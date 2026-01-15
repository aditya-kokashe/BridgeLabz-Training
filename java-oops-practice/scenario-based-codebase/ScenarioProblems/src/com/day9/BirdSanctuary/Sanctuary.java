package com.day9.BirdSanctuary;

import java.util.*;

public class Sanctuary {
    private List<Bird> birds = new ArrayList<>();

    public void addBird(Bird b) {
        birds.add(b);
    }

    public void displayAll() {
        for (Bird b : birds) b.eat();
    }

    public void showFlying() {
        for (Bird b : birds)
            if (b instanceof Flyable)
                ((Flyable) b).fly();
    }

    public void deleteById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }
}
