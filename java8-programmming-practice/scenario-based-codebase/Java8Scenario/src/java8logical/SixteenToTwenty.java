package java8logical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SixteenToTwenty {
	public static void main(String[] args) {
		System.out.println("16. Find numbers greater than 50");
		List<Integer> list = List.of(10,55,60,23,90);
		List<Integer> res =  list.stream().filter(x -> x>50).toList();
		System.out.println(res);
		
		
		System.out.println("+-----------------------------------------------------+");

		System.out.println("17. Group strings by length");
		List<String> list1 = List.of("a" , "bb" , "ccc" , "dd");
		Map<Integer, List<String>> groupedStrs =  list1.stream().collect(Collectors.groupingBy(x -> x.length()));
		System.out.println(groupedStrs);
		
		
		System.out.println("+-----------------------------------------------------+");

		System.out.println("18. Find first non-repeated character");
		String txt = "stress";
		Character nonRepeatedChar =  txt.chars()
				.mapToObj(c -> (char) c)
				.filter(ch -> txt.indexOf(ch) == txt.lastIndexOf(ch))
				.findFirst()
				.orElse(null);
		System.out.println(nonRepeatedChar);
		

		
		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("19. Convert List<Integer> to List<String>");
		List<Integer> list2 = Arrays.asList(1,2,3);
		List<String> listStrings = list2.stream()
				.map(String::valueOf)
				.toList();		
		System.out.println(listStrings);
		
		
		System.out.println("+-----------------------------------------------------+");

		System.out.println("20. Count occurrences of each word");
		String txt2 = "java is java and java is fast";
		Map<String, Long> countOccurences = Arrays.stream(txt2.split(" "))
				.collect(Collectors.groupingBy(
						word -> word,
						Collectors.counting()));
		System.out.println(countOccurences);
		
		
		
	}
}
