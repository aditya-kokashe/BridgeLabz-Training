package com.day4.HospitalQueue;

public class HospitalQueue {
	
	public static void bubbleSort(Patient[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				
				if(arr[j].criticality < arr[j+1].criticality) {
					Patient temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
