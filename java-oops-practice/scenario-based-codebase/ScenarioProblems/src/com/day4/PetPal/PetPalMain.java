package com.day4.PetPal;

public class PetPalMain {

    public static void main(String[] args) {

        Pet p1 = new Dog("Tony", 2);   
        Pet p2 = new Cat("Tostada", 2);   
        Pet p3 = new Bird("Mitthu", 2);  

       
        p1.makeSound();
        p1.feed();
        p1.play();
        p1.sleep();
        System.out.println("\nPet Mood: " + p1.getMood());
        
        System.out.println("+-----------------------+");
        p2.makeSound();
        p2.feed();
        p2.play();
        p2.sleep();
        System.out.println("\nPet Mood: " + p2.getMood());
        
        System.out.println("+-----------------------+");
        p3.makeSound();
        p3.feed();
        p3.play();
        p3.sleep();
        
        
        System.out.println("\nPet Mood: " + p3.getMood());
        System.out.println("+-----------------------+");
    }
}
