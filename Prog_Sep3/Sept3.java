import java.util.Scanner;

public class Sept3 {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Input number below to find the square root");
//		
//		int num1 = scan.nextInt();
//		
//		double root=0;
//		
//		if(num1>=0)
//		{
//			root = Math.sqrt(num1);
//		}
//		else
//		{
//			System.out.println("cannot find root of negative number");
//		}
//		System.out.println(root);
//		
//		//program other two flowcharts
//		
//	//1. is find the ABS vale
//	//2. is check if number is even or odd
//		
//		System.out.println("Input a number bellow to find its absolute value");
//		
//		int num2 = scan.nextInt();
//		
//		if(num2 >=0)
//		{
//			System.out.println("ABS is equal too " + num2);
//		}
//		else
//		{
//			int ABS = num2*(-1);
//			System.out.println("ABS is equal too " + ABS);
//		}
//		
//		System.out.println("Input a number below to check if even or odd");
//		
//		int num3 = scan.nextInt();
//		
//		if(num3%2==0)
//		{
//			System.out.println("Even");
//		}
//		else
//		{
//			System.out.println("Odd");
//		}
		
		System.out.println("Input a value bellow for x");
		
		int x = scan.nextInt();
		
		System.out.println("Input a value bellow for y");
		
		int y = scan.nextInt();
		
		if(x>y)
		{
			System.out.println( y + " is the smaller number " + x + " is the larger number");
		}
		else
		{
			if(x==y)
			{
				System.out.println( "x and y are the same ");
			}
			else
			{
				System.out.println( x + " is the smaler number and " + y + " is the larger number");
			}
		}
		
	}

}
