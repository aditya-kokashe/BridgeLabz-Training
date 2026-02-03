package java8logical;
import java.util.*;

public class FirstFive {
	
	public static void main(String[] args) {
		//question 1st
		System.out.println("1. Count vowels in a string using Stream");
		String txtString = "programming";
		long countVowels = txtString.chars()
				.mapToObj(c -> (char) c)
				.filter(ch -> "aeiou".contains(txtString.valueOf(ch)))
				.count();
		System.out.println(countVowels);
		
		System.out.println("+-----------------------------------------------------+");

		//===================================================================
		System.out.println("2. Count number of words in a sentence");
		String txt = "Java is very powerful";
		long res = Arrays.stream(txt.split(" ")).count(); 
		System.out.println(res);

		
		System.out.println("+-----------------------------------------------------+");

		//===================================================================
		
		System.out.println("3. Find even numbers from list");
		List<Integer> list = List.of(2,5,7,8,10,13);
		List<Integer> res2 = list.stream().filter(x -> x%2 == 0).toList();
		System.out.println(res2);
		
		
		System.out.println("+-----------------------------------------------------+");

		//===================================================================
		
		System.out.println("4. Convert list of strings to uppercase");
		List<String> list2 = List.of("java","spring","boot");
		List<String> res3 = list2.stream().map(x-> x.toUpperCase()).toList();
		System.out.println(res3);
		
		
		System.out.println("+-----------------------------------------------------+");

		//===================================================================
		
		System.out.println("5. Find string length list");
		List<String> list3 = List.of("cat","elephant","dog");
		List<Integer> res4 = list3.stream().map(x -> x.length()).toList();
		System.out.println(res4);
		
		
		
	}
}
