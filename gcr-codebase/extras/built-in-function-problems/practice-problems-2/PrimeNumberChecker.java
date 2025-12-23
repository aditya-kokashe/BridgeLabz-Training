import java.util.Scanner;
public class PrimeNumberChecker{

    //Method to check whether a number is prime
    public static boolean isPrime(int number){
        //Prime numbers must be greater than 1
        if(number<=1){
            return false;
        }
        //Check divisibility from 2 to number-1
        for(int i=2; i<=number/2; i++){
            if(number%i==0){
                return false; 
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
		
		
		//Display the results
        if(isPrime(num)){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is Not a Prime Number");
        }
    }
}
