import java.util.Scanner;

public class Mainoct18 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
//		String str = "";
//		
//		do
//		{
//			System.out.println("enter either rectangle or circle below");
//			str = scan.nextLine();
//			str = str.trim();
//			str = str.toLowerCase();
//		}while(!str.equals("rectangle") && !str.equals("circle"));
//		
//		System.out.println(str);
		
		
		//take in a string from the user
		//and count how many times the letter 'a' occurs in the string
		
		String str1 = "";
		
		int j = 0;
		
		System.out.println("Input a string bellow and i'll tell you how many a's there are");
		str1 = scan.nextLine();
		str1 = str1.toLowerCase();
		
		for(int i = 0; i<str1.length(); i++)
		{
			if(str1.charAt(i)=='a')
			{
				j++;
			}
		}
		System.out.println(j);
		
		
		//you create a string with whatever you like
		//then the user enter a string 
		//check to see is the user string is a substring of the predefined string
		//ie) does their string exist inside yours
		
		String str2 = "Hello my friend, how are you?";
		
		System.out.println("Input a string bellow");
		
		String str3 = scan.nextLine();
		
		if(str2.contains(str3))
		{
			System.out.println("substring");
		}
		else
		{
			System.out.println("not substring");
		}
		
		

	}

}
