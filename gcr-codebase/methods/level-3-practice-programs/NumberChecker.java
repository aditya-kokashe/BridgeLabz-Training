import java.util.Scanner;
public class NumberChecker{
    //Find count of digits
    public static int countDigits(int number){
        int count = 0;
        int temp = number;
        while(temp!=0){
            count++;
            temp /= 10;
        }
        return count;
    }
    //Store digits of the number in an array
    public static int[] getDigits(int number, int count){
        int[] digits = new int[count];
        int temp = number;
        for(int i=count-1; i>=0; i--){
            digits[i] = temp % 10;
            temp /= 10;
        }
        return digits;
    }
    //Check Duck Number
    public static boolean isDuckNumber(int[] digits){
        for(int digit : digits){
            if(digit!=0){
                return true;
            }
        }
        return false;
    }
    //Check Armstrong Number
    public static boolean isArmstrongNumber(int number, int[] digits){
        int sum = 0;
        int power = digits.length;
        for(int digit : digits){
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    //Find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int digit : digits){
            if(digit>largest){
                secondLargest = largest;
                largest = digit;
            }else if(digit>secondLargest && digit!=largest){
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }
    //Find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int digit : digits){
            if(digit<smallest){
                secondSmallest = smallest;
                smallest = digit;
            }else if(digit<secondSmallest && digit!=smallest){
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        //Count digits
        int count = countDigits(number);
        //Store digits in array
        int[] digits = getDigits(number, count);
        //Display digits
        System.out.print("Digits: ");
        for(int digit : digits){
            System.out.print(digit + " ");
        }
		
		
        //Duck number check
        System.out.println("\nDuck Number: " + (isDuckNumber(digits) ? "Yes" : "No"));
        //Armstrong number check
        System.out.println("Armstrong Number: "+ (isArmstrongNumber(number, digits) ? "Yes" : "No"));
        //Largest & second largest
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestValues[0]);
        System.out.println("Second Largest Digit: " + largestValues[1]);
        //Smallest & second smallest
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestValues[0]);
        System.out.println("Second Smallest Digit: " + smallestValues[1]);
        input.close();
    }
}
