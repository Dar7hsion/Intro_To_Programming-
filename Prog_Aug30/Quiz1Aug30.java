import java.util.Scanner;

public class Quiz1Aug30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input the radius below");
		
		int radius = scan.nextInt();
		
		System.out.println("Please input the height below");
		
		//Formula is Surface area = 2(pi)rh+2(pi)r^2
		//area of a circle is (pi)r^2 * 2 for each circle
		//surface area of just the cylinder is 2(pi)rh
		
		int height = scan.nextInt();
		
		//CH is the area of just the cylinder
		double CH = (2*((3.14)*(radius*height)));
		
		//CS is the area of one circle
		double CS = ((3.14)*(radius*radius));
		
		//Surface area of both circles and cylinder
		double SAC = (CH)+2*(CS);
		
		System.out.println("surface area of the cylinder is" + " " + SAC);
		
	
		
	}

}
