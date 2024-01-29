import java.util.Scanner;

public class Mainoct8 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//the user enters two numbers, use a for loop to print from the first number to the second
		System.out.println("Input a number below for the starting value");
		int start = scan.nextInt();
		
		System.out.println("Input a number below for the ending value");
		int end = scan.nextInt();
		
		for(int i = start; i<=end; i++)
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//the user enters a number, print true if its prime, and false if its composite
		System.out.println("Input a number below");
		
		int num = scan.nextInt();
		
		boolean flag = true;
		
		for(int i = 2; i<num; i++)
		{
			if(num%i==0)
			{
				flag=false;
			}
		}
	
		System.out.println(flag);
	}

}
