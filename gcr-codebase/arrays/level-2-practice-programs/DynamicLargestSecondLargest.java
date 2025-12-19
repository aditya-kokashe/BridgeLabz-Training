/*modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. 
This is done to consider all digits to find the largest and second-largest number */

import java.util.Scanner;
class DynamicLargestSecondLargest{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
		//Taking digit from the input number logic
        while(number!=0){
            if(index==maxDigit){
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for(int i=0; i<index; i++){
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index++] = number%10;
            number/=10;
        }
        int largest = 0;
        int secondLargest = 0;
        for(int i=0; i<index; i++){
            if(digits[i]>largest){
                secondLargest = largest;
                largest = digits[i];
            }else if(digits[i]>secondLargest && digits[i]!=largest){
                secondLargest = digits[i];
            }
        }


		//Display largest and second largest
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}
