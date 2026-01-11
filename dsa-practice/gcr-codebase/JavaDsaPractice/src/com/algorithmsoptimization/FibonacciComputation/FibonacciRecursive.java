package com.algorithmsoptimization.FibonacciComputation;

public class FibonacciRecursive {
    public int calculate(int n) {
        if (n <= 1)
            return n;
        return calculate(n - 1) + calculate(n - 2);
    }
}
