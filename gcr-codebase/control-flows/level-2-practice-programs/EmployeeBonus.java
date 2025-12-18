//Create a program to find the bonuses of employees based on their years of service.

import java.util.Scanner;
class EmployeeBonus{
    public static void main(String[] args){

        //Input salary and years
        Scanner input = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter years of service: ");
        int years = input.nextInt();

        //Display the bonus amount 
        if(years > 5){
            double bonus = salary * 0.05;
            System.out.println("Bonus amount is " + bonus);
        }else{
            System.out.println("Bonus not applicable");
        }
        input.close();
    }
}
