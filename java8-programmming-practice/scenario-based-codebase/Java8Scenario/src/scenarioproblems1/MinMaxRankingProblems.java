package scenarioproblems1;

import java.util.*;

public class MinMaxRankingProblems {
	public static void main(String[] args) {

		List<Student> students = StudentData.getStudents();
		
		System.out.println("1.Find the student with the best (lowest) rank.");
		Student bestStudent =	students.stream()
				.min(Comparator.comparingInt(Student::getRank))
				.get();
		System.out.println(bestStudent);
		
		
		System.out.println("+---------------------------------------------------+");
		
		System.out.println("2.Find the student with the worst (highest) rank.");
		
		Student worstStudent = students.stream()
				.max(Comparator.comparingInt(Student::getRank))
				.get();
		System.out.println(worstStudent);
		
		System.out.println("+---------------------------------------------------+");
		
		System.out.println("3.Find the second best rank holder.");
		
		Optional<Student> secondBestStudent = students.stream()
				.sorted(Comparator.comparingInt(Student::getRank))
				.distinct()
				.skip(1)
				.findFirst();
		System.out.println(secondBestStudent.get());
		
		
		System.out.println("+---------------------------------------------------+");
			
		System.out.println("4.Find the third best rank holder.");
		
		Optional<Student> thirdBestStudent = students.stream()
				.sorted(Comparator.comparingInt(Student::getRank))
				.skip(2)
				.findFirst();
		System.out.println(thirdBestStudent.get());
		
		
		System.out.println("+---------------------------------------------------+");

		System.out.println("5.Find the youngest student.");
		
		Optional<Student> youngestStudentOptional =	students.stream()
				.sorted(Comparator.comparingInt(Student::getAge))
				.findFirst();
		System.out.println(youngestStudentOptional.get());
		
		
		System.out.println("+---------------------------------------------------+");
		
		System.out.println("6.Find the oldest student.");
		
		Optional<Student> oldestStudentOptional = students.stream()
				.sorted(Comparator.comparingInt(Student::getAge))
				.findFirst();
		System.out.println(oldestStudentOptional.get());
		
	}
}
