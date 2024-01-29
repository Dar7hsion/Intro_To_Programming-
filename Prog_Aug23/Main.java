import java.util.Scanner;

public class Main
{

	public static void main(String[] args) 
	{
		
		//rprogram that finds the area of a circle
		
		//program take radius of from the user
		
		//and displays the area on screen to the user 
		
		//C=piR^2
		//Math.PI = pi
		//Radius is 8
				
				//int R = 8;
				
				//double c = Math.PI*(R*R);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the raduis");
		double radius = scan.nextDouble();
		
		//calculates the area
		double area = (3.14)*radius*radius;
		
		//and displays the area on screen to user 
		System.out.println("The area of the circle is " + area);
		
		//program that takes in side length and returns the returns the volume of the cube associated with it
		
		System.out.println("Enter the side length");
		double length = scan.nextDouble();
		
		double volume = length*length*length;
				
		System.out.println("volume of a cube is "+ volume);

		
		//program will take the length and height from the user 
		//and will return the area of the triangle (remember that the area of a triangle is 1/2(b*h))
		
		System.out.println("Enter Base");
		int Base = scan.nextInt();
		
		System.out.println("Enter leg");
		int leg = scan.nextInt();
		
		double A2 = (1/2.0)*(Base*leg);
		
		System.out.println("Area of a triangle is " + A2 + "if the Base is " + Base + " and leg is " + leg);
		
		
		
		
		
		

	}

}