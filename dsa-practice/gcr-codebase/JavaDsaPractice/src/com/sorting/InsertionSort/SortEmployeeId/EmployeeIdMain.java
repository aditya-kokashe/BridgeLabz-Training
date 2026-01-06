package com.sorting.InsertionSort.SortEmployeeId;

public class EmployeeIdMain {
	public static void main(String[] args) {
        int[] employeeIds = {105, 102, 110, 101, 108, 103};
        System.out.println("Before Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        int n = employeeIds.length;

        //Insertion Sort Logic
        for (int i=1; i<n; i++) {
            int key = employeeIds[i];
            int j = i - 1;
            while (j >= 0 && employeeIds[j] > key) {
                employeeIds[j + 1] = employeeIds[j];
                j--;
            }
            employeeIds[j + 1] = key;
        }

        System.out.println("\nAfter Sorting:");
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
    }
}
