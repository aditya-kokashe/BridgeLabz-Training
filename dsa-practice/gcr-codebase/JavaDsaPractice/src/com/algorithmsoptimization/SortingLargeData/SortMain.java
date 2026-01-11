package com.algorithmsoptimization.SortingLargeData;

public class SortMain {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 1000000};

        BubbleSort b = new BubbleSort();
        MergeSort m = new MergeSort();
        QuickSort q = new QuickSort();

        for(int n : sizes){

            int[] base = new int[n];
            for(int i=0;i<n;i++) base[i] = (int)(Math.random()*n);

            if(n <= 10000){
                int[] a1 = base.clone();
                long s = System.nanoTime();
                b.sort(a1);
                long e = System.nanoTime();
                System.out.println("Bubble Sort("+n+") : " + (e-s)/1_000_000 + " ms");
            } else {
                System.out.println("Bubble Sort("+n+") : Unfeasible");
            }

            int[] a2 = base.clone();
            long s = System.nanoTime();
            m.sort(a2,0,a2.length-1);
            long e = System.nanoTime();
            System.out.println("Merge Sort("+n+") : " + (e-s)/1_000_000 + " ms");

            int[] a3 = base.clone();
            s = System.nanoTime();
            q.sort(a3,0,a3.length-1);
            e = System.nanoTime();
            System.out.println("Quick Sort("+n+") : " + (e-s)/1_000_000 + " ms");

            System.out.println("------------------------------------");
        }
    }
}
