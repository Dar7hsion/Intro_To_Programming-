import java.util.Scanner;

public class Sept1 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		//int num = scan.nextInt();

		/*String str = scan.next();
		
		String str1 = "hello";
		String str2 = str1;
		
		
		System.out.println(str2);
		
		if(str1==str2)
		{
			System.out.println("Same Memory location");
		}	
		if(str.equals("hello"))
		{	
			System.out.println("smae variable contents");
		}
		
		System.out.println("are yopu ready?");
		String answer = scan.next();
		
		if(answer.equals("yes"))
		{
			System.out.println("get up get up");
		}
		else
		{
			System.out.println("ok....");
		}*/

		//System.out.println(num + " is a good number");
		
		//have the user enter a number, then ask them if the number is the side a square or the radius of a circle
		//solve for area using the correct forumla
		//square = num*num
		//circle = 3.14*num*num
		
		System.out.println("Input the number below");
		int num = scan.nextInt();
		
		System.out.println("Is shape a square or circle");
		String anwser = scan.next();
		
		if(anwser.equals("square"))
		{
		System.out.print("area of the square is " + (num*num));
		}
		else
		
		{
		System.out.print("area of the circle is " + (3.14*num*num));
		}
		
	}

}
