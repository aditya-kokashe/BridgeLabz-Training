package com.objectmodeling.levelone;

public class UniversityMain {

    public static void main(String[] args) {

        Faculty f1 = new Faculty(201, "Dr. Sharma");
        Faculty f2 = new Faculty(202, "Dr. Mehta");

        University uni = new University("Global Tech University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showDetails();

        //Closing university
        uni.closeUniversity();

        System.out.println("\nFaculty still exists even after university deletion:");
        f1.showFaculty();
        f2.showFaculty();
    }
}
