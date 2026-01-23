package com.exceptions.throwandthrows;

public class CalculateIntrest {
	public static double calculate(double amount, double rate, int years) 
											throws IllegalArgumentException 
	
	{
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        return (amount * rate * years) / 100;
    }
}
