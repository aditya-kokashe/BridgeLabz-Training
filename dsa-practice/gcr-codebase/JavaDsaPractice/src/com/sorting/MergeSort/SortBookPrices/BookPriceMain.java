package com.sorting.MergeSort.SortBookPrices;

public class BookPriceMain {
	public static void main(String[] args) {

        int[] prices = {550, 299, 799, 450, 999, 199, 650};

        System.out.println("Before Sorting:");
        for (int p : prices) {
            System.out.print(p + " ");
        }

        MergeSort.mergeSort(prices, 0, prices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
