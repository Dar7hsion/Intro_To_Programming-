import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
			Scanner scan = new Scanner(System.in);
			
		//System.out.println("Enter the Base 1");	
		//int base1 = scan.nextInt();
		
		//System.out.println("Enter the Base 2");
		//int base2 = scan.nextInt();
		
		//System.out.println("Enter the height");
		//int height = scan.nextInt();
		
		//double area = height*((base1+base2)/2);
		
		//System.out.println("The area of the trapeziod is " + area);
		
		//Lets say you have a rectangular room, you want to find the surface area of the room
		//take the length and the height of the room from the user
		//and calculate the surface area
		//Remember that the surface area is the area of each side of the room added together
		//2*l*w+2*l*h+2*w*h
		
		//System.out.println("Enter the First Width");
		//int width1 = scan.nextInt();
		
		//System.out.println("Enter the First lenght");
		//int lenght1 = scan.nextInt();
		
		//System.out.println("Enter the 2nd length");
		//int lenght2 = scan.nextInt();
		
		//System.out.println("Enter the Frist height");
		//int height2 = scan.nextInt();
		
		//System.out.println("Enter the 2nd Width");
		//int width3 = scan.nextInt();
		
		//System.out.println("Enter the 2nd height");
		//int height3 = scan.nextInt();
		
		//double SA = (2*(width1*lenght1))+(2*(lenght2*height2))+(2*(width3*height3));
		
		//System.out.print("The surface area of the room is " + SA);
		
		System.out.println("Please enter the height of the room");
		int RHieght = scan.nextInt();
		
		System.out.print("Please enter the length of the room");
		int Rlenght = scan.nextInt();
		
		System.out.println("Please enter the width of the room");
		int RWidth = scan.nextInt();
		
		int surface = 2*RHieght*Rlenght + 2*RHieght*RWidth + 2*Rlenght*RWidth;
		
		System.out.println("The surface area of the room is " + surface);
		
		//lets say, you want to paint the room we just talked about
		//each can of paint, covers 30 sq ft
		//how many cans of paint does it take to paint the room? 
		//you can assume the surface area is in sq ft
		
		int paint = 30;
		
		double PN = surface/30;
		
		System.out.print("You will need " + PN + "cans of paint");
		
		
		
		
		
		

	}

}
