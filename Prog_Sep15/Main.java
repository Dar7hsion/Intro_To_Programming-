import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		
	Scanner scan = new Scanner(System.in);
	//take a year from the user and return if the year is a leap year. recall that a leap year happens
	//every 4 years, and that 2016 was a leap year
	
//	System.out.println("Input a year bellow and I will tell you if its a leap year");
//	
//	int num = scan.nextInt();
//	
//	if(num%4==0)
//	{
//		System.out.print("this year is a leap year");
//	}
//	else
//	{
//		System.out.println("this is not a leap year");
//	}
	//write a program that takes three numbers from the user, and puts them in order from smallest to largest
	
		System.out.println("Input 3 different numbers bellow and I will order them smallest to largest now Input a num 1 bellow");
		int x = scan.nextInt();
		
		System.out.println("Input a num 2 bellow");
		int y = scan.nextInt();
		
		System.out.println("Input a num 3 bellow");
		int z = scan.nextInt();
		
		if(x<y && x<z)
		{
			if(y<z)//if x is the smallest
			{
				System.out.println(x + " " + y + " " + z);
			}
			else
			{
				System.out.println(x + " " + z + " " + y);
			}
		}
		else if(y<x && y<z)//if y is the smallest
		{
			if(x<z)
			{
				System.out.println(y + " " + x + " " + z);
			}
			else
			{
				System.out.println(y + " " + z + " " + x);
			}
		}
		else if(x<y)//if z is the smallest
		{
			System.out.println(z + " " + x + " " + y);
		}
		else
		{
			System.out.println(z + " " + y + " " + x);
		}
	}

}
