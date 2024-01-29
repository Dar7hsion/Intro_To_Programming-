import java.util.Scanner;

public class Functions {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String D = "";
		
		while(!D.equals("2D") || !D.equals("3D"))
		{
			System.out.println("Is the shape 2D or 3D");
				
			D = scan.nextLine();
				
			D=D.toUpperCase();
			
			if(D.equals("2D"))
			{
				function1();
				break;
			}
			else if(D.equals("3D"))
			{
				function2();
				break;
			}
		}
	}
	
	public static void function1()
	{
		Scanner scan = new Scanner(System.in);
		String E = "";
		
		while(!E.equals("spuare") || !E.equals("circle") || !E.equals("triangle"))
		{
			System.out.println("square, circle or triangle?");
			E = scan.nextLine();
			E = E.toLowerCase();
			
			if(E.equals("square"))
			{
				System.out.print(Squ());
				return;
			}
			else if(E.equals("circle"))
			{
				System.out.print(Cir());
				return;
			}
			else if(E.equals("triangle"))
			{
				System.out.print(Tri());
				return;
			}
		}
	}
	
	public static void function2()
	{
		Scanner scan = new Scanner(System.in);
		String E = "";
		
		while(!E.equals("cylinder") || !E.equals("rectprism") || !E.equals("pyramid"))
		{
			System.out.println("cylinder, rectprism, and pyramid");
			E = scan.nextLine();
			E = E.toLowerCase();
			
			if(E.equals("cylinder"))
			{
				System.out.print(Cyl());
				return;
			}
			else if(E.equals("rectprism"))
			{
				System.out.print(Rec());
				return;
			}
			else if(E.equals("pyramid"))
			{
				System.out.print(Pry());
				return;
			}
		}
	}
	
	public static int Squ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the lenght");
		int lenght = scan.nextInt();
		int area = lenght*lenght;
		return area;
	}
	
	public static double Cir()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the radius");
		int radius = scan.nextInt();
		
		double area = 3.14*radius*radius;
		System.out.print(area);
		return area;
	}
	
	public static int Tri()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the hight and base");
		int hight = scan.nextInt();
		int base = scan.nextInt();
		int area = (hight*base)/2;
		return area;
	}
	
	public static double Cyl()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the radius and hight");
		int radius = scan.nextInt();
		int hight = scan.nextInt();
		double area = (2*(3.14*radius*hight))+(2*(3.14*radius));
		return area;
		
	}
	
	public static int Rec()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the hight, width and lenght");
		int hight = scan.nextInt();
		int width = scan.nextInt();
		int lenght = scan.nextInt();
		int area = 2*((width*lenght)+(hight*lenght)+(hight*width));
		return area;
	
	}
	
	public static double Pry()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the width, lenght and hight");
		int width = scan.nextInt();
		int lenght = scan.nextInt();
		int hight = scan.nextInt();
		double area = ((lenght*width)+lenght)*Math.sqrt(((width/2)*(width/2))+(hight*hight))+(width*Math.sqrt((1/2)*(1/2)+(hight*hight)));
		return area;
	}

}
