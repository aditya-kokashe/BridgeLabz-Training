package java8logical;

import java.util.List;

public class SixToTen {
	public static void main(String[] args) {
		System.out.println("6. Count strings starting with ‘a’");
		List<String> list = List.of("apple","banana","ant","car");
		long res = list.stream()
				.filter(x -> x.startsWith("a"))
				.count();
		System.out.println(res);
		
		System.out.println("+-----------------------------------------------------+");
		//=====================================================================
		
		System.out.println("7. Remove empty strings");
		List<String> list2 = List.of("java", "" , "spring" , "" , "boot");
		List<String> res2 = list2.stream()
				.filter(x -> x.length() > 0)
				.toList();
		System.out.println(res2);
		
		
		System.out.println("+-----------------------------------------------------+");
		//=====================================================================
		
		System.out.println("8. Sum of all numbers using stream");
		List<Integer> list3 = List.of(1,2,3,4,5);
		int sum = list3.stream()
				.reduce((a,b) -> a+b)
				.get();
		System.out.println(sum);
		
		System.out.println("+-----------------------------------------------------+");
		//=====================================================================
		
		System.out.println("9. Find max number");
		List<Integer> list4 = List.of(10,25,3,99,45);
		int maxInteger = list4.stream()
								.max(Integer::compareTo)
								.get();
		System.out.println(maxInteger);
		
		
		System.out.println("+-----------------------------------------------------+");
		//=====================================================================

		System.out.println("10. Reverse each string in list");
		List<String> list5 = List.of("java", "api");
		List<String> res3 =	list5.stream()
				.map(s -> new StringBuilder(s).reverse().toString())
				.toList();
		System.out.println(res3);
		
		
		
	}

}
