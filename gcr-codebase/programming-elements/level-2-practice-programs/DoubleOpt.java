//Similarly, write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;
public class DoubleOpt {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = sc.nextDouble();
		System.out.println("Enter b: ");
		double b = sc.nextDouble();
		System.out.println("Enter c: ");
		double c = sc.nextDouble();
		//performing Double operations 
		double operation1 = a + b * c;
		double operation2 = a * b + c;
		double operation3 = c + a / b;
		double operation4 = a % b + c;
		
		//displaying the resulted 
		System.out.println("The results of Double Operations are: "+operation1+" , "+operation2+" , "+operation3+" , "+operation4);
	}
}	