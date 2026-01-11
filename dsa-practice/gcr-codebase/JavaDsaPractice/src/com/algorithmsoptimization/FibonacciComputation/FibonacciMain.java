package com.algorithmsoptimization.FibonacciComputation;

public class FibonacciMain {

    public static void main(String[] args) {

        int[] testValues = {10, 30, 50};

        FibonacciRecursive rec = new FibonacciRecursive();
        FibonacciIterative itr = new FibonacciIterative();

        for (int n : testValues) {

            System.out.println("Fibonacci N = " + n);

            if (n <= 30) {
                long start = System.nanoTime();
                rec.calculate(n);
                long end = System.nanoTime();
                System.out.println("Recursive Time: " + (end - start) / 1_000_000 + " ms");
            } else {
                System.out.println("Recursive Time: Unfeasible");
            }

            long start = System.nanoTime();
            itr.calculate(n);
            long end = System.nanoTime();
            System.out.println("Iterative Time: " + (end - start) / 1_000_000 + " ms");

            System.out.println("-------------------------------------");
        }
    }
}
