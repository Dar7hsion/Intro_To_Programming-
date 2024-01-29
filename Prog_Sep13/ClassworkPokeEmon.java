import java.util.Scanner;

public class ClassworkPokeEmon 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("This program buesses the pokemon you are thinking of!");
		System.out.println("pick form the following: Pikachu, shinx, litten, chimchar");
		System.out.println("What is the type of the pokemon you are thinking of?");
		
		String pokeType = scan.next();
		
		if(pokeType.equals("electric"))
		{
			System.out.println("what color is the pokemon");
			String pokeColor = scan.next();
			// cant use == for string, has to be equals			
			if(pokeColor.equalsIgnoreCase("blue"))
			{
				System.out.println("how many legs does the pokemon have?");
				int pokeLegs = scan.nextInt();
				if(pokeLegs==4)
				{
					System.out.println("Shinx");
				}
				else
				{
					System.out.println("Minum");
				}
			}
			else
			{
				System.out.println("Pikachu");
			}
		}
		else
		{
			System.out.println("How many legs does the pokemon have?");
			int pokeLegs = scan.nextInt();
			if(pokeLegs==4)
			{
				System.out.println("Litten");
			}
			else
			{
				System.out.println("Chimchar");
			}
		}
		
		
		
//		System.out.println("This program buesses the pokemon you are thinking of!");
//		System.out.println("pick form the following: Snorlax, Chancsey, Dragonite, Salamance");
//		System.out.println("What is the type of the pokemon you are thinking of?");	
//		String pokeType = scan.next();
//		
//		if(pokeType.equals("normal"))
//		{
//			System.out.println("what color is the pokemon");
//			String pokeColor = scan.next();
//			// cant use == for string, has to be equals			
//			if(pokeColor.equals("pink"))
//			{
//				System.out.println("chancsey");
//			}
//			else
//			{
//				System.out.println("Snorlax");
//			}
//		}
//		else
//		{
//			System.out.println("what color is the pokemon?");
//			String pokeColor = scan.next();
//			if(pokeColor.equals("blue"))
//			{
//				System.out.println("Salomance");
//			}
//			else
//			{
//				System.out.println("Dragonite");
//			}
//		}
	}

}
