/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus 
amount the company Zara has to pay, along with the old and new salary.*/

import java.util.Scanner;
public class EmployeeBonusCalculator{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
		int empCount= 10;
        double[] salary = new double[empCount];
        double[] yearsOfService = new double[empCount];
        double[] bonus = new double[empCount];
        double[] newSalary = new double[empCount];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        //Input loop
        for(int i=0; i<empCount; i++){
            System.out.println("Enter details for Employee: "+(i+1));
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();
            System.out.print("Enter years of Service: ");
            yearsOfService[i] = sc.nextDouble();
            if(salary[i]<=0 || yearsOfService[i]<0){
                System.out.println("Invalid input enter again");
                i--; 
            }
        }
        //Bonus calculation loop
        for(int i=0; i<empCount; i++){
            if(yearsOfService[i]>5){
                bonus[i] = salary[i]*0.05;
            }else{
                bonus[i] = salary[i]*0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }


        //Display the output
        System.out.println("Total Old Salary: "+totalOldSalary);
        System.out.println("Total Bonus Paid: "+totalBonus);
        System.out.println("Total New Salary: "+totalNewSalary);
    }
}
