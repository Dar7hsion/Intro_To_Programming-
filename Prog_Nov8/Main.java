import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		//create a function that takes in the width, length, and depth of a rectangular prism
		//and return the surface area
		//remenber surface area if just the area of all 6 faces added together
		System.out.println("input width");
		int width = global.scan.nextInt();
		System.out.println("input width");
		int lenght = global.scan.nextInt();
		System.out.println("input width");
		int depth = global.scan.nextInt();
		
		
		
		System.out.println(totalSArea(lenght, width, depth));

	}
	
	public class global
	{
		public static Scanner scan = new Scanner(System.in);
	}
	public static int LXD(int lenght, int depth)
	{
		int areaLXD = 2*(lenght*depth);
		return areaLXD;
	}
	public static int LXW(int lenght, int width)
	{
		int areaLXW = 2*(lenght*width);
		return areaLXW;
	}
	public static int WXD(int depth, int width)
	{
		int areaWXD = 2*(width*depth);
		return areaWXD;
	}
	public static int totalSArea(int lenght, int width, int depth)
	{
		int total = LXD(lenght, depth) + LXW(lenght, width) + WXD(depth, width);
		return total;
	}
	

}
