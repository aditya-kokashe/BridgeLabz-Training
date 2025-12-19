/*Working with Multi-Dimensional Arrays. Write a Java program to create a 2D Array and Copy the 
2D Array into a single dimension array*/

import java.util.Scanner;
public class TwoDToOneDArray{
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        //Take rows and columns as input
        System.out.print("Enter number of rows: ");
        int rows= sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns= sc.nextInt();
        //Create 2D array
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter matrix elements: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //Create 1D array
        int[] array = new int[rows * columns];
        int index = 0;
        //Copy elements from 2D to 1D
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[index] = matrix[i][j];
                index++;
            }
        }


        //Display 1D array
        System.out.println("1D Array elements: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
