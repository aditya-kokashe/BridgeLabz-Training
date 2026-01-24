package com.junit.passwordvalidator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong1Pass"));
    }

    @Test
    void testInvalidPasswordTooShort() {
        assertFalse(validator.isValid("Ab1"));
    }

    @Test
    void testInvalidPasswordNoUppercase() {
        assertFalse(validator.isValid("password1"));
    }

    @Test
    void testInvalidPasswordNoDigit() {
        assertFalse(validator.isValid("Password"));
    }
}
