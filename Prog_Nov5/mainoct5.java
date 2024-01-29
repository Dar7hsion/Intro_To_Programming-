import java.util.Scanner;

public class mainoct5 {

	public static void main(String[] args) 
	{
		//in main, have the user select a starter pokemon from 3 options
		//depending on what they picked
		//call a function that tells them a little bit about their 'mon
		
		//ex) ""
		//user enters; 1
		//"turtwig is the smallest leaf pokemon, its a grass type"
		
		Scanner scan = new Scanner(System.in);
		int command = 0;
	
		while(command!=1 || command!=2 || command!=3 )
		{
			System.out.println("Hello welcome to the world of pokemon, please select your starter, select 1. for turwig, 2. for chimchar, 3. for piplup");
			command = scan.nextInt();
			
			if(command==1)
			{
				turwig();
				break;
			}
			else if(command==2)
			{
				chimchar();
				break;
			}
			else if(command==3)
			{
				piplup();
				break;
			}
		
		}
		
	}
	
	public static void turwig()
	{
		System.out.println("turtwig is the smallest leaf pokemon, its a grass type");
	}
	public static void chimchar()
	{
		System.out.println("chimchar is the monkey pokemon, its a fire type");
	}
	public static void piplup()
	{
		System.out.println("piplup is the penguin-like pokemon, its a water type");
	}

}
