package com.sorting.BubbleSort.SortStudentMarks;

public class StudentMarksMain {

	public static void main(String[] args) {

        int[] marks = {72, 88, 45, 60, 95, 30, 77};

        System.out.println("Before Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        int n = marks.length;

        //Bubble Sort 
        for (int i=0; i <n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        
        
        System.out.println("\nAfter Sorting:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
