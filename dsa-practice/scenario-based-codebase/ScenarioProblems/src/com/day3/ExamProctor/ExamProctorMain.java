package com.day3.ExamProctor;

import java.util.*;
public class ExamProctorMain {
	public static void main(String [] args) {
		
		Navigation nav = new Navigation();
		HashMap<Integer, Questions> bank = new HashMap<>();
		bank.put(1, new Questions("A", 10));
		bank.put(2, new Questions("B", 10));
		
		nav.navigateTo(1);
		nav.submitAnswer("A");
		nav.navigateTo(2);
		nav.submitAnswer("B");
		
		int score = nav.calculateScore(bank);
		System.out.println("Total Score: "+ score);
	}

}
