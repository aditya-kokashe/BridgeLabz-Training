
package com.annotations.maxlength;

public class MaxLengthMain {

    public static void main(String[] args) {

        User user1 = new User("Mohit");        // Valid
        System.out.println(user1.getUsername());

        User user2 = new User("VeryLongUsername"); // Exception
    }
}
