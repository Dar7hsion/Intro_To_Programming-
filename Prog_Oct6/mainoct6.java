import java.util.Scanner;

public class mainoct6 {

	public static void main(String[] args) 
	{
		//create a loop that prints the letters A-Z
		
//		char num = 'A';
//		
//		do
//		System.out.print(num++ + " ");
//		while(num<=90);
//		
		
		
		//Take a number from the user and display the column of the multiplication table for that number
		//ie) if the user selects 4, print out
		//1 X 4 = 4
		//2 X 4 = 5
		//...
		//10 X 4 = 10 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input a number below");
		
		int num2 = scan.nextInt();
		
		int i = 1;
		
		while(i<=100000000)
		{
			System.out.println(i + "X" + num2 + "=" + (num2*i));
			i++;
		}
		
		

	}

}
