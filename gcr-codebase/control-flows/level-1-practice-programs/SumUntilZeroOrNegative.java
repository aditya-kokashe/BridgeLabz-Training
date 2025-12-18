/*Rewrite the program 10 to find the sum until the user enters 0 or a negative number using 
while loop and break statement.*/

import java.util.Scanner;
public class SumUntilZeroOrNegative{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double total = 0.0;
		//Create a logic to sum until the user enters 0 or a negative
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();
            if (number <= 0){
				break;
            }
            total = total + number;
        }

		//Display the resulted output of total sum
        System.out.println("The total sum is: " + total);
        input.close();
    }
}
