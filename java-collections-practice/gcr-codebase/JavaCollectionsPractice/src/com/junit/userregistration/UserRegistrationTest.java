package com.junit.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test
    void testValidRegistration() {
        assertDoesNotThrow(() ->
                registration.registerUser(
                        "Aditya",
                        "aditya@gmail.com",
                        "Password1"));
    }

    @Test
    void testInvalidUsername() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(
                        "",
                        "user@gmail.com",
                        "Password1"));
    }

    @Test
    void testInvalidEmail() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(
                        "User",
                        "usergmail.com",
                        "Password1"));
    }

    @Test
    void testInvalidPassword() {
        assertThrows(IllegalArgumentException.class,
                () -> registration.registerUser(
                        "User",
                        "user@gmail.com",
                        "pass"));
    }
}
