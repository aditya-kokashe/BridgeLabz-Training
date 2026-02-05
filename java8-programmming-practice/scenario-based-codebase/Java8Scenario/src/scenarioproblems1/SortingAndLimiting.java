package scenarioproblems1;

import java.util.Comparator;
import java.util.List;

public class SortingAndLimiting {
	public static void main(String[] args) {
		List<Student> students = StudentData.getStudents();
		
		
		System.out.println("1.Sort students by rank (ascending).");
		List<String> sortedAscList = students.stream()
				.sorted((a ,b) -> a.getRank()-b.getRank())
				.map(x -> x.getFirstName())
				.toList();
		
		System.out.println(sortedAscList);
		
		System.out.println("+--------------------------------------+");
		
		System.out.println("2.Sort students by age (descending).");
		List<String> sortOnAge = students.stream()
				.sorted((a,b) -> b.getAge() - a.getAge())
				.map(Student::getFirstName)
				.toList();
		System.out.println(sortOnAge);
		
		System.out.println("+--------------------------------------+");
		
		System.out.println("3.Print top 5 students based on rank.");
		List<String> topFive = students.stream()
				.sorted((a,b) -> b.getRank()-a.getRank())
				.limit(5)
				.map(Student::getFirstName)
				.toList();
		System.out.println(topFive);
		
		System.out.println("+--------------------------------------+");
		
		System.out.println("4.Print last 3 students based on rank.");
		List<String> lastThree = students.stream()
				.sorted((a,b) -> a.getRank()-b.getRank())
				.limit(3)
				.map(Student::getFirstName)
				.toList();
		System.out.println(lastThree);
		
		
		System.out.println("+--------------------------------------+");
		
		System.out.println("5.Print students sorted by name and then rank.");
		List<Student> sortedtNameList = students.stream()
				.sorted(Comparator.comparing(Student::getFirstName))
				.toList(); 
		System.out.println("By Name : ");
		sortedtNameList.forEach(System.out::println);
		System.out.println("\nBy rank : ");
		List<Student> sortedRankList = students.stream()
				.sorted(Comparator.comparing(Student::getRank))
				.toList();
		sortedRankList.forEach(System.out::println);
		
		System.out.println("+--------------------------------------+");
	}
}
