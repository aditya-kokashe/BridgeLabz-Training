package com.sorting.QuickSort.SortProductPrices;

public class Products {
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j=low; j<high; j++) {
            if (arr[j]<pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int prices[] = { 499, 1299, 299, 799, 199 };

        quickSort(prices, 0, prices.length - 1);

        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
