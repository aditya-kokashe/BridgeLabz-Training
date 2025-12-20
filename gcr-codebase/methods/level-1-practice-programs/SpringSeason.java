/*Write a program SpringSeason that takes two int values month and day from the command line and prints 
“Its a Spring Season” otherwise prints “Not a Spring Season”.*/

public class SpringSeason{
	public boolean checkSeason(int month, int day){
		//Check if the input month and day lies between March 20 to June 20
		if(month==3 && day>=20){
			return true;
		} 
		else if(month==4 || month==5){
			return true;
		} 
		else if(month==6 && day<=20){
			return true;
		} 
		else{
			return false;
		}
	}


	public static void main(String [] args){
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		//Create SpringSeason class object
		SpringSeason springSeason = new SpringSeason();
		
		
		//Display season 
		boolean isSpring = springSeason.checkSeason(month , day);
		if(isSpring == true){
			System.out.println("Its a Spring Season");
		}else{
			System.out.println("Not a Spring Season");
		}
	}
}