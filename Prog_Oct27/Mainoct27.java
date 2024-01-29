import java.util.Scanner;

public class Mainoct27 {

	public static void main(String[] args) 
	{
		
//		System.out.println(prime(5));
//		System.out.println(prime(6));
//		System.out.println(prime(2));
//		System.out.println(prime(1));
//		System.out.println(prime(-5));
		
		//create a function that checks if two strings are the same
		//not that you may not use .equals() for this, you must do it by hand
		//the code may end execution as soon as it realized they aren't the same 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input a string bellow");
		String str1 = scan.nextLine();
		
		System.out.println("input a string bellow");
		String str2 = scan.nextLine();
		System.out.println(same(str1, str2));
		

	}
	
	public static boolean prime(int num)
	{
		if(num==1)
			return false;
		if(num<0)
			return false;
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean same(String str1, String str2)
	{
		
		if(str1.length() != str2.length())
		{
			return false;
		}
		for(int i = 0; i<str1.length(); i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				return false;
			}
			
		}
		return true;
	}

}
