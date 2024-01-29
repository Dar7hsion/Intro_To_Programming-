import java.util.Scanner;

public class Mainoct13 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("Input a String bellow");
//		
//		String str1 = scan.nextLine();
//		
//	    System.out.println("Input a another String bellow");
//		
//		String str2 = scan.nextLine();
//		
//		for(int i = 0; i<str1.length(); i++)
//		{
//			if(str1.charAt(i)<str2.charAt(i))
//			{
//				System.out.println(str1);
//				break;
//			}
//			else if(str1.charAt(i)<str2.charAt(i))
//			{
//				System.out.println(str2);
//				break;
//			}
//		}
		
		//create a triangle out of * 
		//*
		//**
		//***
		//****
		//*****
		//your print statement must contain only one * the rest must be done with loop code
		
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print('*');
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		for(int i=0; i<5; i++)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print('*');
			}
			System.out.println();
			
		}
		System.out.println();
		

	}

}
