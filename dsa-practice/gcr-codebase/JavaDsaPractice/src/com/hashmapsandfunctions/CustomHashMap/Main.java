package com.hashmapsandfunctions.CustomHashMap;

public class Main {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        map.put(10, 100);
        map.put(20, 200);
        map.put(30, 300);
        map.put(40, 400);
        map.put(20, 250); // update value

        System.out.println("Value of key 20: " + map.get(20));
        map.remove(30);
        map.display();
    }
}
