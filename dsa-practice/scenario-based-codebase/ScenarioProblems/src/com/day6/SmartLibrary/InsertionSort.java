package com.day6.SmartLibrary;

public class InsertionSort {

	public static void sort(Book[] books) {
		for(int i=1; i<books.length ; i++) {
			Book temp = books[i];
			int j = i-1;
			while(j>=0 && books[j].title.compareTo(temp.title)>0) {
				books[j+1] = books[j];
				j--;
			}
			books[j+1] = temp;
		}
	}

}
