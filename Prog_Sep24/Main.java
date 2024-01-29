import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
		//Take in a number from the user from 1 to 8 and tell the user what pokemon region is associated
		// with that generation number.
		
		System.out.println("Input bellow a number 1-8 and I will tell you what Pokemon region it is associated with that generation of Pokemon ");
		
		
		//int gen is taken from the user and shows the generation number that will be used in the switch bellow
		int gen = scan.nextInt();
		
		
		switch(gen)
		{
			
		case 1:
			System.out.println("Gen 1 is the Kanto region");
			break;
			
		case 2:
			System.out.println("Gen 2 is the Johto region");
			break;
			
		case 3:
			System.out.println("Gen 3 is the Hoenn region");
			break;
			
		case 4:
			System.out.println("Gen 4 is the Sinnoh region");
			break;
			
		case 5:
			System.out.println("Gen 5 is the Unova region");
			break;
			
		case 6:
			System.out.println("Gen 6 is the Kalos region");
			break;
			
		case 7:
			System.out.println("Gen 7 is the Alola region");
			break;
			
		case 8:
			System.out.println("Gen 8 is the Galar region");
			break;
			
		default:
			System.out.println("This is not a generation of Pokemon");
			break;
			
		}	
		

	}

}
