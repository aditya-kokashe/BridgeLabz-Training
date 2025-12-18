//Create a program to find the bonus of employees based on their years of service.

import java.util.Scanner;
class EmployeeBonus{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //Take salary as input
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        //Take years of service of employee
        System.out.print("Enter years of service: ");
        int yearsOfService = input.nextInt();

        //Check if employee is eligible for bonus
        if(yearsOfService > 5){
            double bonus = salary * 0.05;
			//Display resulted Bonus
            System.out.println("Bonus amount is: " + bonus);
        }else{
            System.out.println("No bonus");
        }
    }
}
