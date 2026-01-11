package com.algorithmsoptimization.StringConcatenation;

public class StringConcateMain {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1_000_000};

        StringUsingNormal s1 = new StringUsingNormal();
        StringUsingBuilder s2 = new StringUsingBuilder();
        StringUsingBuffer s3 = new StringUsingBuffer();

        for(int n : sizes) {

            System.out.println("Operations Count: " + n);

            if(n <= 10000) {
                long start = System.nanoTime();
                s1.concat(n);
                long end = System.nanoTime();
                System.out.println("String Time: " + (end-start)/1_000_000 + " ms");
            } else {
                System.out.println("String Time: Unusable");
            }

            long start = System.nanoTime();
            s2.concat(n);
            long end = System.nanoTime();
            System.out.println("StringBuilder Time: " + (end-start)/1_000_000 + " ms");

            start = System.nanoTime();
            s3.concat(n);
            end = System.nanoTime();
            System.out.println("StringBuffer Time: " + (end-start)/1_000_000 + " ms");

            System.out.println("-----------------------------------");
        }
    }
}
