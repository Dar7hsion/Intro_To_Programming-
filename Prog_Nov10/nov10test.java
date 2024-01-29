import java.util.Scanner;

public class nov10test {

	public static void main(String[] args) 
	{
		
		//create a function that takes in three numbers, the height of a pyramid, the length of the base of the pyramid, 
		//and the width of the base of the pyramid, and returns the volume of the pyramid. 
		
		//Taking in input from the user is optional
		
		//Formula for your convenience V=(L*W*H)/3
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input the height below");
		double Length = scan.nextDouble();
		
		System.out.println("input the width below");
		double Width = scan.nextDouble();
		
		System.out.println("input the length below");
		double Height = scan.nextDouble();
		
		System.out.println("Volume: " + Volume(Length, Width, Height));
	}

	public static Double Volume(Double Length, Double Width, Double Height)
	{
		double volume = (Length*Width*Height)/3;
		
		return volume;
	}
}



