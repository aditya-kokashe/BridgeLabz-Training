package com.functionalinterface.cloning;

public class CloneMain {

    public static void main(String[] args) {

        try {
            Prototype original = new Prototype(1, "Original Object");
            Prototype copy = (Prototype) original.clone();

            System.out.println("Original: " + original);
            System.out.println("Cloned: " + copy);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
        }
    }
}
