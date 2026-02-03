package java8logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElevenToFifteen {
	public static void main(String[] args) {
		
		System.out.println("11. Remove duplicate elements from list");
		List<Integer> list = List.of(1,2,2,3,4,4,5);
		List<Integer> res = list.stream()
				.distinct()
				.toList();
		System.out.println(res);
		
		System.out.println("+-----------------------------------------+");
		
		System.out.println("12. Sort list in descending order");
		List<Integer> list2 = List.of(5,1,9,3);
		List<Integer> res2 = list2.stream()
				.sorted(Comparator.reverseOrder())
				.toList();
		System.out.println(res2);
		
		
		System.out.println("+-----------------------------------------+");
		
		System.out.println("13. Find second highest number");
		List<Integer> list3 = List.of(10,40,30,20);
		int res3 = list3.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst()
				.orElse(null);
		System.out.println(res3);
		
		
		System.out.println("+-----------------------------------------+");
		
		System.out.println("14. Join strings with comma");
		List<String> list4 = Arrays.asList("Java","Spring","Boot");
		String res4 = list4.stream()
				.collect(Collectors.joining(","));
		System.out.println(res4);
		
		
		System.out.println("+-----------------------------------------+");
		
		System.out.println("15. Frequency of each character");
		String txt = "banana";
		Map<Character, Long> charFrequency = txt.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(
						c -> c,
						LinkedHashMap::new,
						Collectors.counting()));
		System.out.println(charFrequency);
		
		
		
		
	}

}
