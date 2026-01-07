package com.sorting.CountingSort.SortStudentAges;

public class Ages {

    public static void main(String[] args) {
        int ages[] = { 12, 15, 11, 14, 18, 10, 15 };

        int max = 18;
        int min = 10;

        int count[] = new int[max-min+1];

        for (int age : ages) {
            count[age - min]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }

        for (int a : ages) {
            System.out.print(a + " ");
        }
    }
}
