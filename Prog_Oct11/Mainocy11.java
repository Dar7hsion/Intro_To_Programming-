import java.util.Scanner;

public class Mainocy11 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//create a 5 by 10 grid of "*"
		//use nested to achieve this 
		//you print statement may only include one asterrisk
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print('*');
			}
			System.out.println();
			
		}
		System.out.println();
		
		//take two numbers from the user
		//print all the prime numbers between
		System.out.println("Input a number below for the starting value");
		int start = scan.nextInt();
		
		System.out.println("Input a number below for the ending value");
		int end = scan.nextInt();
		
		for(int i = start; i<=end; i++)
		{
			boolean flag = true;
			
			for(int j = 2; j<i; j++)
			{
				if(i%j==0)
				{
					flag=false;
				}
			}
			if(flag && i>1)
				System.out.print(i + " ");
		}

	}

}
