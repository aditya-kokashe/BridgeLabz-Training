package com.searching.strings;

public class PerformanceCompare {
    public static void main(String[] args) {

        int n = 1000000;

        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) sb.append("hello");
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        StringBuffer bf = new StringBuffer();
        for(int i=0;i<n;i++) bf.append("hello");
        long end2 = System.nanoTime();

        System.out.println("StringBuilder Time: " + (end1-start1));
        System.out.println("StringBuffer Time: " + (end2-start2));
    }
}
