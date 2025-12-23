//Write a program to demonstrate ArrayIndexOutOfBoundsException

import java.util.Scanner;
public class ArrayIndexOutOfBoundsException{
    //Generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index){
        //Accessing index greater than array length
        System.out.println("Name: " + names[index]);
    }

    //Handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names, int index){
        try {
            System.out.println("Name: " + names[index]);
        }catch(ArrayIndexOutOfBoundsException e){
			//Handles specific array index exception
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }catch(RuntimeException e){
			//Handles any other runtime exception
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();
        String[] names = new String[size];
        //Taking names input
        for (int i=0; i<size; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }
        //Taking index input
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();


        //Calling method that handles exception
        handleException(names, index);
		sc.close();
    }
}