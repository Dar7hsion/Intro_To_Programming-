import java.util.Random;
import java.util.Scanner;

public class Mainoct25 {
	
	public static void main(String[] args) 
	{
		
		//create a math quiz for the user, the quiz will ask 10 math questions
		//the user will be allowed to pick up what type of question they will be askd
		//1 for addition, 2 for subtraction, 3 for multiplaction, and 4 for division
		//functions will be in charge of asking the questions
		//there should be 4 functions, one for each type of problem
		//after all 10 questions are asked, give the user a score
		//based on percentage correct
		
		
//		int i =1;
//		int correct = 0;
//		
//		while(i<=10)	
//		{
//			int num1 = rand.nextInt(20)+1;
//			int num2 = rand.nextInt(20)+1;
//			
//			System.out.println(num1 + "+" + num2 + "=?");
//			int newguess = scan.nextInt();
//			if(guess==(num1+num2))
//			{
//				System.out.println("Correct");
//				correct++;
//			}
//			else
//			{
//				System.out.println("Incorrect");
//			}
//		i++;	
//		}
//		System.out.println("you guessed " + correct + " out of 10");
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the math quiz, what tpye of quiz do you want?");
		
		
		for(int i =0; i<10; i++)
		{
		
		System.out.println("Pick a question type, 1. addition, 2. subtraction, 3. multiplication, 4. division");
		int choice = scan.nextInt();
		int count=0;
			
			if(choice==1)
			{
				if(add())
					count++;
			}
			else if(choice==2)
			{
				if(sub())
					count++;
			}
			else if(choice==3)
			{
				if(mul())
					count++;
			}
			else if(choice==4)
			{
				if(div())
					count++;
			}
		}
		

	}
	
	public static boolean add()
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(20);
		int num2 = rand.nextInt(20);
		System.out.println(num1 + "+" + num2);
		int ans = scan.nextInt();
		if(ans==(num1+num2))
		{
			System.out.println("correct");
			return true;
		}
		else
		{
			System.out.println("incorrect");
			return false;
		}
	}
	public static boolean sub()
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(20);
		int num2 = rand.nextInt(20);
		System.out.println(num1 + "-" + num2);
		int ans = scan.nextInt();
		if(num2>num1)
		{
			int temp = num1;
			num1=num2;
			num2=temp;
		}
		System.out.println(num1 + "-" + num2);
		if(ans==(num1-num2))
		{	
			System.out.println("correct");
			return true;
		}
		else
		{
			System.out.println("incorrect");
			return false;
		}
	}
	public static boolean mul()
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(20);
		int num2 = rand.nextInt(20);
		System.out.println(num1 + "*" + num2);
		int ans = scan.nextInt();
		if(ans==(num1*num2))
		{
			System.out.println("correct");
			return true;
		}
		else
		{
			System.out.println("correct");
			return false;
		}
	}
	public static boolean div()
	{
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int num1 = rand.nextInt(20);
		int num2 = rand.nextInt(20);
		System.out.println(num1 + "/" + num2);
		int ans = scan.nextInt();
		if(ans==(num1/num2))
		{
			System.out.println("correct");
			return true;
		}
		else
		{
			System.out.println("incorrect");
			return false;
		}
	}

}
