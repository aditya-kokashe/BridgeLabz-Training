package com.exceptions.customexception;

//Custom Exception
public class InvalidAgeException extends Exception {
	 public InvalidAgeException(String message) {
	     super(message);
	 }
}