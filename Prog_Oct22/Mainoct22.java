import java.util.Scanner;

public class Mainoct22 {

	public static void main(String[] args) // mian method, up until now the only one in out program
	{
		//the term method and function both refer to the smae thing
		
		System.out.println(areaRectangle(2, 3));//call is making it pull and run
		
		System.out.println(areaRectangle(5, 2));
		System.out.println(areaRectangle(7, 8));
		System.out.println(areaRectangle(10, 10));
		
		
		
		
		System.out.println(areaRectangle(200, 200));
		//String str = "hello"
				
		//str.replace('l', 'w')
		
		//create a function that calculates the volume of a rectangular prism
		func1();
		
		
		System.out.println(areaRectanglarPrism(2,2,2));
		
		//take a string from the user, pass the string to a function
		//the function, should determine if the first letter of the string is capitalized
		//return true, if its is, and false if its not
		
		Scanner scan = new Scanner(System.in);
		
		String userinput = scan.next();
		
		System.out.println(letterCap(userinput));

	}
	
	public static void func1()
	{
		System.out.println("hello world");
		return;
	}
	
	public static int areaRectangle(int lenght, int width)
	{
		int area;
		
		area = lenght*width;
		
		return area;
		
	}
	
	public static int areaRectanglarPrism(int lenght, int width, int hight)
	{
		int volume;
		
		volume = lenght*width*hight;
		
		return volume;
	}
	
	public static boolean letterCap(String str1)
	{
		
		boolean bool = true;
		
		if(str1.charAt(0)>=65 && str1.charAt(0)<90)
		{
			bool = true;
		}
		else
		{
			bool = false;
		}
		return bool;
	}

}
