import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
	//Program take in a float, it prints "ZERO" if the float is zero, other wise it prints "positive" or "negative"depending and it prints "small"
	//if the float absolute value is <1 and "large" if the float is over 1,000,000
	
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Enter a number bellow");
		
		double num = scan.nextDouble();
		
		if(num==0)
		{
			System.out.println("ZERO");
		}
		else if(num>0)
		{
			System.out.println("Positive");
	//		if(num>1000000||num<-1000000)
	//		{
	//			System.out.println("Large");
	//		}
	//		else if(num<1||num>-1)
	//		{
	//			System.out.println("Small");
	//		}
		}
		else
		{
			System.out.println("Negative");
	//		if(num>1000000||num<-1000000)
	//		{
	//			System.out.println("Large");
	//		}
	//		else if(num<1||num>-1)
	//		{
	//			System.out.println("Small");
	//		}
		}
		if(num>1000000||num<-1000000)
		{
			System.out.println("Large");
		}
		else if(num<1&&num>0||num>-1&&num<0)
		{
			System.out.println("Small");
		}
	}
}
