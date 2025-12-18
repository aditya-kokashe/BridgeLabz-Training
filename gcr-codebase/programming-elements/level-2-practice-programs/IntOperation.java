/*Write an IntOperation program by taking a, b, and c as input values and print the following 
integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the 
precedence of the operators. */

import java.util.Scanner;
public class IntOperation {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Enter c: ");
		int c = sc.nextInt();
		int operation1 = a + b * c;
		int operation2 = a * b + c;
		int operation3 = c + a / b;
		int operation4 = a % b + c;
		
		//displaying the resulted 
		System.out.println("The results of Int Operations are: "+operation1+" , "+operation2+" , "+operation3+" , "+operation4);
	}
}	