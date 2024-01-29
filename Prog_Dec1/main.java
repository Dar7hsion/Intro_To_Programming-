import java.io.FileNotFoundException;//all exceptions have to be imported 
import java.util.Random;
//import java.io.IOException;
import java.util.Scanner;
import java.io.*;//needed to import file
public class main {

	public static void main(String[] args) 
	{
//		try
//		{
//			File myfile = new File("C:\\Users\\apurs\\Documents\\test");
//			Scanner read = new Scanner(myfile);
//			
//			System.out.println(read.nextLine());
//		}
//		catch(FileNotFoundException e)
//		{
//			System.out.println(e);
//		}
//		
//		try
//		{
//			File myfile = new File("C:\\Users\\apurs\\Documents\\hello.txt");
//			Scanner read = new Scanner(myfile);
//			if(!myfile.exists())
//			{
//				myfile.createNewFile();
//			}
//			else
//			{
//				System.out.println("this file already exists");
//			}
//			FileWriter fw = new FileWriter(myfile);
//			
//			fw.write("testing.....");
//			fw.flush();
//			fw.close();
//		}
//		catch(IOException e)
//		{
//			System.out.println(e);
//		}
		
		//create a program that asks the user to guess a number between 1 and 1000
		//count how any tries it takes them
		//save tries to a txt file named highscore
		//on subsequent plays check the old highscore to see if they beat it
		//if they did, save the score, otherwise leavie it
		
		try
		{
			
			File myfile = new File("C:\\Users\\apurs\\Documents\\highscore1");
			Scanner scan = new Scanner(System.in);
			Random rand = new Random();
			
			if(!myfile.exists())
			{
				myfile.createNewFile();
				FileWriter fw = new FileWriter(myfile);
				fw.write(99);
				fw.flush();
				fw.close();
			}
			else
			{
				System.out.println("this file already exists");
			}
			
			int num = rand.nextInt(10)+1;
			int count=0;
			int guess = 0;
			System.out.println("guess a number 1-10");
			while(guess!=num)
			{
			
			guess=scan.nextInt();
				if(guess==num)
				{
					System.out.println("Correct");
					count++;
				}
				else
				{
					System.out.println("Incorrect");
					count++;
					if(guess<num)
					{
						System.out.println("too low");
					}
					else
					{
						System.out.println("too high");
					}
				}
			}
			Scanner read = new Scanner(myfile);
			
			
			if(read.hasNextInt())
			{
				if(read.nextInt()>count)
				{
					FileWriter fw = new FileWriter(myfile);
					System.out.println("new high score!");
					fw.write("" + count);
					fw.flush();
					fw.close();
				}
			}
			else
			{
				FileWriter fw = new FileWriter(myfile);
				System.out.println("no new high score");
				fw.write("" + count);
				fw.flush();
				fw.close();
			}
		}
		catch(IOException a)
		{
			System.out.println(a);
		}
		
		
	}

}
