package java8logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TwentyoneToTwentyfive {
	public static void main(String[] args) {
		
		System.out.println("21. Partition numbers into even and odd");
		List<Integer> list = List.of(1,2,3,4,5,6);
		Map<String, List<Integer>> evenOdd =  list.stream()
				.collect(Collectors.groupingBy(x -> x%2 == 0 ? "even" : "odd"));
		System.out.println(evenOdd);
		
		

		
		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("22. Find duplicate elements only");
		List<Integer> list1 = Arrays.asList(1,2,3,2,4,5,1);
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicate2 = 
				list1.stream()
				.filter(x -> !seen.add(x))
				.collect(Collectors.toSet());
		System.out.println(list1);
		System.out.println(duplicate2);
		
		

		
		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("23. Find longest string");
		List<String> list2 = Arrays.asList("java", "microservices", "api");
		list2.stream().filter(x -> x.length()>5).forEach(System.out::println);
		
		

		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("24. Find top 3 highest numbers");
		List<Integer> list3 = Arrays.asList(10,90,30,70,50);
		List<Integer> result = 	list3.stream().sorted(Comparator.reverseOrder())
					  .limit(3)
					  .toList();
		System.out.println(result);
		
		
		

		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("25. Flatten list of lists");
		List<List<Integer>> list4 = Arrays.asList(
				Arrays.asList(1,2),
				Arrays.asList(3,4),
				Arrays.asList(5)
				);
		System.out.println(list4.stream().flatMap(x -> x.stream())
				.toList());
		
		
		
	}
}
