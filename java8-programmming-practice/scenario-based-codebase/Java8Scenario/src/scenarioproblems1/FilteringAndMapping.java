package scenarioproblems1;

import java.util.List;

public class FilteringAndMapping {
	public static void main(String[] args) {
		List<Student> students = StudentData.getStudents();
		
		
		System.out.println(" 1.Print all students whose rank is less than 50.");
		List<String> stu = students.stream()
				.filter(x -> x.getRank() < 50)
				.map(Student::getFirstName)
				.toList();
		
		System.out.println(stu);
		
		System.out.println("+-----------------------------------------------------+");
		
		
		System.out.println(" 2.Print all students whose age is greater than 25.");
		students.stream()
				.filter(x -> x.getAge()>25)
				.map(Student::getFirstName)
				.forEach(System.out::println);
		System.out.println("+-----------------------------------------------------+");

		System.out.println(" 3.Print the names of all students only.");
		students.stream()
				.map(x -> x.getFirstName())
				.forEach(System.out::println);
		System.out.println("+-----------------------------------------------------+");
		

		System.out.println("4.Print all students belonging to Mechanical Engineering");
		students.stream()
				.filter(x -> x.getDepartment().equals("Mechanical"))
				.map(Student::getFirstName)
				.forEach(System.out::println);
		
		System.out.println("+-----------------------------------------------------+");
		
		System.out.println("5.Print all students not from Mumbai.");
		students.stream()
				.filter(x -> !x.getCity().equals("Mumbai"))
				.map(Student::getFirstName)
				.forEach(System.out::println);
		
		
	}
}
