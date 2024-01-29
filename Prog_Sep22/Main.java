import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
		//crate a program that takes a number from the user and tells them what month it is and how many days are in that month
		//create two flag variables to keep track of weather the month falls in the fall or spring or neither 
		//Incorporate the leap year calculation to get the right number of days for February
		// after the switch has concluded tell the user what semester their month is in
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number bellow to find out what month is it");
		
		int m = scan.nextInt();
		
		boolean isFall = false;
		
		boolean isSpring = false;
		
		switch(m)
			{
			case 1:
				System.out.println("January 31");
				isSpring = true;
				break;
			
			case 2:
				System.out.println("what year is it?");
				int y = scan.nextInt();
					if(y%4==0)
					{
						System.out.println("Febuary 29");
					}
					else
					{
						System.out.println("February 28");
					}
				isSpring = true;
				break;
			
			case 3:
				System.out.println("March 31");
				isSpring = true;
				break;
			
			case 4:
				System.out.println("April 30");
				isSpring = true;
				break;
			
			case 5:
				System.out.println("May 31");
				isSpring = true;
				break;
			
			case 6:
				System.out.println("June 30");
				break;
				
			case 7:
				System.out.println("July 31");
				break;
			
			case 8:
				System.out.println("August 31");
				isFall= true;
				break;
			
			case 9:
				System.out.println("September 30");
				isFall = true;
				break;
			
			case 10:
				System.out.println("October 31");
				isFall = true;
				break;
				
			case 11:
				System.out.println("November 30");
				isFall = true;
				break;
			
			case 12:
				System.out.println("December 31");
				break;
				
			default:
				System.out.println("This is not a month");
				break;
			}
	
			if(isFall)
			{
				System.out.println("fall");
			}
			else if(isSpring)
			{
				System.out.println("spring");
			}
			else
			{
				System.out.println("nether");
			}


	}

}
