/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based 
on their ages and the tallest among the friends based on their heights*/

import java.util.Scanner;
class YoungestAndTallestFriend{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for(int i=0; i<3; i++){
			//Input age and height of Amar, Akbar, Anthony
			System.out.print("Enter age: ");
            age[i] = input.nextInt();
			System.out.print("Enter height: ");
            height[i] = input.nextDouble();
        }
        int youngest = age[0];
        double tallest = height[0];
        for(int i=1; i<3; i++){
            if(age[i]<youngest){
                youngest=age[i];
            }
            if(height[i]>tallest){
                tallest=height[i];
            }
        }


		//Display the result
        System.out.println("Youngest Age: "+youngest);
        System.out.println("Tallest Height: "+tallest);
    }
}
