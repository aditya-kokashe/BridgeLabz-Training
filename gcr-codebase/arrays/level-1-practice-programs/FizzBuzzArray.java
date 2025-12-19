/*Write a program FizzBuzz, take a number as user input and if it is a positive integer 
loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead 
of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". 
Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...*/


import java.util.Scanner;
public class FizzBuzzArray{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        if(number <= 0){
            System.out.println("Please enter a positive integer");
            return;
        }
        String[] result = new String[number + 1];
		//Fill the array
        for(int i=0; i<=number; i++){
            if(i%3==0 && i%5 == 0){
                result[i] = "FizzBuzz";
            }else if(i%3 == 0) {
                result[i] = "Fizz";
            }else if(i%5 == 0) {
                result[i] = "Buzz";
            }else{
                result[i] = String.valueOf(i);
            }
        }


        //Print the array with positions
        for(int i=0; i<=number; i++){
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
