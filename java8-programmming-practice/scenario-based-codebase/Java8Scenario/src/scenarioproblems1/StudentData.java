package scenarioproblems1;

import java.util.*;

public class StudentData {
	public static List<Student> getStudents() {

        return List.of(
            new Student(1, "Aditya", 21, "Male", "Delhi", 50, "Mechanical","9876543210"),
            new Student(2, "Riya", 20, "Female", "Indore", 20, "Electrical","9876543211"),
            new Student(3, "Aman", 26, "Male", "Delhi", 80, "Mechanical","9876543212"),
            new Student(4, "Sneha", 21, "Female", "Pune", 30,"Finance", "9876543213"),
            new Student(5, "Rahul", 23, "Male", "Mumbai", 60, "Mechanical","9876543214"),
            new Student(6, "Neha", 28, "Female", "Delhi", 10,"Comp Sci", "9876543215"),
            new Student(7, "Karan", 22, "Male", "Chennai", 90, "Mechanical","9876543216"),
            new Student(8, "Pooja", 21, "Female", "Mumbai", 40,"Civil Eng", "9876543217"),
            new Student(9, "Vikas", 26, "Male", "Noida", 70, "Management","9876543218"),
            new Student(10, "Anjali", 27, "Female", "Mumbai", 10, "Business","9876543219")
        );
    }
}
