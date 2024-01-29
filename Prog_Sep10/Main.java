import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
//		int num = scan.nextInt();
//		
//		if(num>0)
//		{
//			System.out.println("This is positive");
//			
//		}
//		else if(num<0)
//		{
//			System.out.println("This is negative");
//			
//		}
//		else
//		{
//			System.out.println("the number is zero");
//			
//		}
//	
//		
//	//write a program that allows the user to enter a charter
//	//if it is a vowel tell them
//	//if it is a consonant tell them 
//		//.charAt(0) takes the first letter in the line scanned making it 1 will scan the next letter 
//		
//		// control / will comment out a high lighted line
//		
//		System.out.println("\nEnter a letter bellow");
//		
//		char c = scan.next().charAt(0);
//		
//		if(c=='a'||c=='e'||c=='i'||c =='o'||c=='u')
//		{
//			System.out.println("vowel");
//			
//		}
//		else
//		{
//			System.out.println("consonant");
//			
//		}
//		
	//have the user enter a number, tell them the month associated with and how many days are in the month
	//if the user enters a number too high or too low, tell them there is no month for the number
		
		System.out.println("Enter a number for a month of a the year");
		
		int m = scan.nextInt();
		
		if(m==1)
		{
			System.out.println("January: 31");
		}
		else if(m==2)
		{
			System.out.println("February: 28");
		}
		else if(m==3)
		{
			System.out.println("March: 31");
		}
		else if(m==4)
		{
			System.out.println("April: 30");
		}
		else if(m==5)
		{
			System.out.println("May: 31");
		}
		else if(m==6)
		{
			System.out.println("June: 30");
		}
		else if(m==7)
		{
			System.out.println("July: 31");
		}
		else if(m==8)
		{
			System.out.println("August: 31");
		}
		else if(m==9)
		{
			System.out.println("September: 30");
		}
		else if(m==10)
		{
			System.out.println("October: 31");
		}
		else if(m==11)
		{
			System.out.println("November: 30");
		}
		else if(m==12)
		{
			System.out.println("December: 31");
		}
		else
		{
			System.out.println("not a month");
			
		}
	}

}
