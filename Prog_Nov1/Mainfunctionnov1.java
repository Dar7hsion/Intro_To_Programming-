import java.util.Scanner;

public class Mainfunctionnov1 {

	public static void main(String[] args) 
	{
		//Today is just going to be a practice day to work on what
		//you have learned so far
		//Create a function that can concatanate two strings into one
		//the function will accept two strings as arguments
		//the function will then return one string that is both put together
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Input a string bellow");
		String A = scan.nextLine();
		
		System.out.println("Input a string bellow");
		String B = scan.nextLine();
		
		
		
		System.out.println(function1(A, B));

	}
	
	public static String function1(String A, String B)
	{
		String AB = A + B;
		
		return AB;
	}

}
