package com.collections.queueinterface.generatebinarynumbers;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {

    public static void generateBinary(int n) {

        if (n <= 0) return;

        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 1; i <= n; i++) {

            String current = queue.remove();
            System.out.print(current + " ");

            queue.add(current + "0");
            queue.add(current + "1");
        }
        System.out.println();
    }
}
