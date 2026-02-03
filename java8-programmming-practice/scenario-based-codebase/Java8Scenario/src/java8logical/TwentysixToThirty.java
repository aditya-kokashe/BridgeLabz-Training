package java8logical;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TwentysixToThirty {
	public static void main(String[] args) {

		System.out.println("26. Find sum of squares of even numbers");
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional<Integer> res = list.stream()
				.filter(x -> x%2 == 0)
				.map(x -> x*x)
				.reduce((x ,y) -> x+y);
		System.out.println(res.get());
		
		

		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("27. Sort map by value");
		Map<String, Integer> map = Map.of(
				"A",3,
				"B",1,
				"C",2
				);
		System.out.println(map);
		System.out.println("\nSorted normally : ");
		map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.forEach(System.out::println);
				
		System.out.println("\nSorted in a Map : ");
		Map<String, Integer> res2 = map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(
						Map.Entry::getKey,
						Map.Entry::getValue,
						(e1, e2) -> e1,
						LinkedHashMap::new
						));
		System.out.println(res2);
		

		System.out.println("+-----------------------------------------------------+");

		System.out.println("28. Find employee with highest salary (using stream)");
		List<Employee> employees = Arrays.asList(
				new Employee("Abhinav" , 25000),
				new Employee("Mohan" , 45000),
				new Employee("Kartik" , 20000)
				);
		System.out.println(employees);
		Employee highestPaidEmployee = employees.stream()
				.max(Comparator.comparingDouble(Employee::getSalary))
				.orElse(null);
		System.out.println(highestPaidEmployee);
		
		

		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("29. Find common elements between two lists");
		List<Integer> list2 = List.of(1,2,3,4);
		List<Integer> list3 = List.of(3,4,5,6);
		System.out.println(list2 + " and " + list3);
		List<Integer> commonElements = list2.stream().filter(list3::contains).toList();
		System.out.println(commonElements);
		
		

		
		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("30. Find kth smallest element");
		List<Integer> list4 = Arrays.asList(9, 1, 5, 3, 7);
        int k = 2;
        Integer res3 =
                list4.stream()
                    .sorted()
                    .skip(k - 1)
                    .findFirst()
                    .orElse(null);

        System.out.println(res3);
		
		
		
		
	}
}
