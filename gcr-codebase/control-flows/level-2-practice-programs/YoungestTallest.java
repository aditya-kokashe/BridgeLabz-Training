/*Create a program to find the youngest friend among Amar, Akbar, and Anthony
   based on age, and the tallest friend based on height */

import java.util.Scanner;
class YoungestTallest{
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        // Take age inputs
        System.out.println("Enter age of Amar, Akbar, Anthony: ");
        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();
        // Take height inputs
        System.out.println("Enter height of Amar, Akbar, Anthony: ");
        int heightAmar = input.nextInt();
        int heightAkbar = input.nextInt();
        int heightAnthony = input.nextInt();


        //Logic to find youngest friend
        if(ageAmar <= ageAkbar && ageAmar <= ageAnthony){
            System.out.println("Youngest friend is Amar");
        }else if(ageAkbar <= ageAmar && ageAkbar <= ageAnthony){
            System.out.println("Youngest friend is Akbar");
        }else{
            System.out.println("Youngest friend is Anthony");
        }
        //Logic to find tallest friend
        if(heightAmar >= heightAkbar && heightAmar >= heightAnthony){
            System.out.println("Tallest friend is Amar");
        }else if(heightAkbar >= heightAmar && heightAkbar >= heightAnthony){
            System.out.println("Tallest friend is Akbar");
        }else{
            System.out.println("Tallest friend is Anthony");
        }
    }
}
