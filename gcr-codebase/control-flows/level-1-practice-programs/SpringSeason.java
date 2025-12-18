/*Write a program SpringSeason that takes two int values month and day from the command line and prints
“Its a Spring Season” otherwise prints “Not a Spring Season”. 
*/

class SpringSeason{
    public static void main(String[] args){
		//Input month and day value from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

		//Check if the given date lies in the Spring Season
        if (month == 3 && day >= 20){
		System.out.println("Its a Spring Season");
		} 
		else if (month == 4 || month == 5){
			System.out.println("Its a Spring Season");
		} 
		else if (month == 6 && day <= 20) {
			System.out.println("Its a Spring Season");
		} 
		else {
			System.out.println("Not a Spring Season");
		}
    }
}
