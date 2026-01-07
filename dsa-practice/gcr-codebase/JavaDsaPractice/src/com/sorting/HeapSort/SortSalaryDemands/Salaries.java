package com.sorting.HeapSort.SortSalaryDemands;

public class Salaries {
    static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i=n/2-1; i>=0; i--) {
            heapsort(arr, n, i);
        }
        for (int i=n-1; i>=0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapsort(arr, i, 0);
        }
    }

    static void heapsort(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapsort(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        int salary[] = { 45000, 30000, 60000, 35000 };

        heapSort(salary);

        for (int s : salary) {
            System.out.print(s + " ");
        }
    }
}
