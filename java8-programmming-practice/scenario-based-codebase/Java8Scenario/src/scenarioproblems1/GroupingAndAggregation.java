package scenarioproblems1;

import java.util.*;
import java.util.stream.*;

public class GroupingAndAggregation {
	
	public static void main(String[] args) {
		List<Student> students = StudentData.getStudents();
		
		System.out.println("1.Count the number of students in each department.");
		Map<String , Long> stuByDept = students.stream()
				.collect(
						Collectors.groupingBy(
								Student::getDepartment,
								Collectors.counting()
								)
						);
		stuByDept.forEach((dept, count) -> System.out.println(dept + " : " + count));
		
		System.out.println("+-----------------------------------------------------------+");
		
		System.out.println("2.Count the number of students in each city.");
		Map<String, Long> stuByCityMap = students.stream()
				.collect(
						Collectors.groupingBy(
								Student::getCity,
								Collectors.counting()
								)
						);
		stuByCityMap.forEach((city, count) ->
				System.out.println(city + " : " + count)
				);
		
		System.out.println("+-----------------------------------------------------------+");
		
		System.out.println("3.Find the average age of students in each department.");
		Map<String, Double> avgAgeByDeptMap = students.stream()
				.collect(
						Collectors.groupingBy(
								Student::getDepartment,
								Collectors.averagingInt(Student::getAge)
								)
						);
		avgAgeByDeptMap.forEach((dept , count) -> System.out.println(dept +"   \t(avg age : "+ count +" yrs)"));
		
		System.out.println("+-----------------------------------------------------------+");
		
		System.out.println("4.Find the average rank of students by gender.");
		
		Map<String, Double> avgRankByGenderMap = students.stream()
				.collect(
						Collectors.groupingBy(
								Student::getGender,
								Collectors.averagingInt(Student::getRank)
								)
						);
		avgRankByGenderMap.forEach((gender , rank) -> System.out.println(gender + "     \t(avg rank :" + rank + ")"));
		
		System.out.println("+-----------------------------------------------------------+");
		
		System.out.println("5.Find the total number of students in the organization");
		long totalStudents = students.stream()
				.count();
		
		System.out.println("Total number of students : " + totalStudents);
		
		System.out.println("+-----------------------------------------------------------+");
		
		System.out.println("6.Find the department with the highest average rank.");
		String  highestAvgRankByDeptMap = students.stream()
				.collect(Collectors.groupingBy(
						Student::getDepartment,
						Collectors.averagingInt(Student::getRank)
						))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(e -> e.getKey() +" : "+ e.getValue()+ " rank")
				.orElse(null);
		System.out.println(highestAvgRankByDeptMap);
		
		
		
		
		
		
		
	}
}
