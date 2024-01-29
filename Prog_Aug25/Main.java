import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ask the user for their favorite color
		//the computer repeat their favorite color tell the user that is their favorite as well
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your favorite color?");
		String Color = scan.next();
		
		System.out.println("Your favorite color is" + " " + Color + ", " + Color + " is my favorite color as well");
		
		//you will take the height and radius of a cylinder and return the volume 
		//remember that the volume of a cylinder is the area of the circle at the top, multiplied by the height
		//the area of a circle is 3.14rad*rad
		
		System.out.println("What is the Radius");
		double Rad = scan.nextDouble();
		
		System.out.println("What is the hight?");
		double Hight = scan.nextDouble();
		
		double areaC = (3.4)*(Rad*Rad);
		
		double volumeC = areaC*Hight;
		
		System.out.println("Volume of the cylinder is " + volumeC);
		
		

	}

}
