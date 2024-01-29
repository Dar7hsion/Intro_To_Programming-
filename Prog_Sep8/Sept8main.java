import java.util.Random;
import java.util.Scanner;

public class Sept8main {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		/*int num1 = rand.nextInt();//generates a random number of any value
		
		System.out.println(num1);
		
		//putting +10 on the out side will limit what can print 
		
		int num2 = rand.nextInt(21);//generates a random number between 0 and 20
		
		System.out.println(num2);
		
		System.out.println(num1+num2);*/  // has a small chance of giving a vary wrong answer if addition pushes
		//it over its intager limit
		
		//int num3 = integat.MAX_VALUE; //generates a max value, 
		
		//addition quiz, generate 2 random numbers, have the user solve the answer, and check if the answer is corect 
		
		int num1 = rand.nextInt(21);
		
		int num2 = rand.nextInt(21);
		
		int sum = num1+ num2;
				
		System.out.println("what is " + num1 + " + " + num2);
		
		int guess = scan.nextInt();
		
		if(guess == sum)
		{
			System.out.println("correct");
		}
		else
		{
			System.out.println("Incorrect that correct answer is " + sum);
		}
		
		
		int x = rand.nextInt(10)+1;
		
		System.out.println("Guess a number between 1 and 10");
		
		int guess1 = scan.nextInt();
		
		int ans = x-guess1;
		
		if(ans>=0)
		{
			System.out.println("The difference between your number and the random number is " + ans);
			
		}	
		else
		{
			System.out.println("The difference between your number and the random number is " + ans*(-1));
			
		}
		}

}
