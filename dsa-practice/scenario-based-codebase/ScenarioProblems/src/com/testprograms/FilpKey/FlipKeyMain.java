package com.testprograms.FilpKey;

import java.util.Scanner;
public class FlipKeyMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toLowerCase();
				
		System.out.println(cleanseAndInvert(word));
		
	}
	
	public static String cleanseAndInvert(String word) {
		String key = "";
		if(word.length() < 6 || word == null) {
			return key;
		}
		for(int i=0 ; i<word.length(); i++){
			int ch = word.charAt(i);
			boolean isValid = true;
			if(ch < 65 && ch > 90) {
				isValid = false;
				return key;
			}
			if(ch%2 !=0) {
				key +=(char) ch;
			}
		}
		key = reverse(key);
		String answerStr = "";
		for(int i=0; i<key.length(); i++) {
			char ch = key.charAt(i);
			if(i%2== 0) {
				char upper = (char) (ch - 32);
				answerStr += upper;
			}else {
				answerStr += ch;
			}
		}
		return answerStr;
	}
	
	public static String reverse(String str) {
		String reversed = "";
		for(int i=str.length()-1; i>=0; i--) {
			reversed += str.charAt(i);
		}
		return reversed;
	}
}








