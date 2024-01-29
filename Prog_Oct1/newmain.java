import java.util.Random;
import java.util.Scanner;

public class newmain {

	public static void main(String[] args) 
	{
		
		//write a progrwm that generates a random number between 1 and 10
		//the user tries to guess the number
		//if they guess correct the program ends
		//if they guess incorrect, the program hints higher or lower
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
	
		int num = rand.nextInt(10)+1;
		int guess = 0;
		boolean bool = true;
		int count = 0;
		
		while(bool)
		{
			System.out.println("guess a number between one and 10");
			guess = scan.nextInt();
			count++;
			if(guess!=num)
			{
				if(guess>num)
				{
					System.out.println("too high");
				}
				else
				{
					System.out.println("too low");
				}
				
			}
			else
			{
				bool= false;
			}
		}
		System.out.println("Correct");
		System.out.println("it took you " + count + " guesses");
		
		//create an addition quiz that asks the user 10 addition questions
		//the program keeps track of the number of correct answers
		//and displays a score at the end 
		
		int i =1;
		int correct = 0;
		
		while(i<=10)	
		{
			int num1 = rand.nextInt(20)+1;
			int num2 = rand.nextInt(20)+1;
			
			System.out.println(num1 + "+" + num2 + "=?");
			int newguess = scan.nextInt();
			if(guess==(num1+num2))
			{
				System.out.println("Correct");
				correct++;
			}
			else
			{
				System.out.println("Incorrect");
			}
		i++;	
		}
		System.out.println("you guessed " + correct + " out of 10");
		
		
	}

}
