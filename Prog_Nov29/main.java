import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 and 10"); 
		
		try
		{
			int num = scan.nextInt();
			
			while(num<1 || num>10)
			{
				System.out.println("invalid please enter a new number");
				num = scan.nextInt();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("invalid please enter a new number");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("invalid please enter a new number");
		}
		finally
		{
			System.out.println("this runs either way");
		}
		
		//create a program that takes the average of however many numbers you choose to give it 
		//use a try-catch statment to ensure the program dosent crash if the user selects zero
		//ie) cannot divide by zero
		
//		System.out.println("Enter numbers bellow to fine the average, the numbers cannot be 0"); 
//		int total = 0;
//		try
//		{
//			for(int i =1; i>=1; i++)
//			{
//				System.out.println("enter a number");
//				int E = scan.nextInt();
//				total=total+E;
//				int adv = total/i;
//				System.out.println(adv);
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println("cant be zero");
//		}
//		finally
//		{
//			System.out.println("");
//		}
		//double j =0/0;
		System.out.println("Enter numbers bellow to fine the average, the number of numbers cannot be 0"); 
		int total = 0;
		System.out.println("enter a number below this is the number of numbers you will be entering");
		int num = scan.nextInt();
		try
		{
			for(int i =1; i<=num; i++)
			{
				System.out.println("enter a number");
				int E = scan.nextInt();
				total=total+E;
				int adv = total/i;
				System.out.println(adv);
			}
		}
		catch(Exception e)
		{
			System.out.println("cant divid by zero");
		}
		finally
		{
			System.out.println("");
		}
	}

}
