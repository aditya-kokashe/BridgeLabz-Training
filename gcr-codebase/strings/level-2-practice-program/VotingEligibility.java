/*Write a program to take user input for the age of all 10 students in a class and check whether 
the student can vote depending on his/her age is greater or equal to 18.*/

import java.util.Scanner;
public class VotingEligibility{
    //Generate ages using user input
    public static int[] generateAges(int n, Scanner sc){
        int[] ages = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }
    //Check voting eligibility
    public static String[][] checkVoting(int[] ages){
        String[][] result = new String[ages.length][2];
        for(int i=0; i<ages.length; i++){
            result[i][0] = String.valueOf(ages[i]);
            if(ages[i]<0){
                result[i][1] = "false";
            }else if(ages[i]>=18){
                result[i][1] = "true";
            }else{
                result[i][1] = "false";
            }
        }
        return result;
    }
    //Display result in tabular format
    public static void displayResult(String[][] data){
        System.out.println("Age\tCan Vote");
        for(int i=0; i<data.length; i++){
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = generateAges(10, sc);
        String[][] result = checkVoting(ages);
        displayResult(result);
    }
}
