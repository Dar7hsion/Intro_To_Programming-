
public class Mainoct20TEST {

	public static void main(String[] args)
	{
	
		//Write a program that prints out the following pattern
		//******
		// ****
		//  ** 
		//  **
		// ****
		//******
		//your print statment must be a singular asterisk and a singular space, and looping must be done to print the pattern using 2 print statments as well as new line print
		
		int n = 4;
		
		for(int i = 0; i<n; i++)
		{
			
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k = 1; k<(n-i)*2-1; k++)
			{
				System.out.print("*");
			}
			if(i<2)
			System.out.println();
		}
		
		for(int i = 0; i<=n; i++)
		{
			for(int j = n; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<i*2-1; k++)
			{
				System.out.print("*");
			
			}
			if(i!=0)
			System.out.println();
		}
		
	

	}
}