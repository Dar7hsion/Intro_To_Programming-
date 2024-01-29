import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class arry {

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		//create an array
		//fill the arry with random number
		//loop throught and find the smallest number 
		//swap that number with first element of the array
		
//		Random rand = new Random();
//		
//		int [] arr = new int [12];
//		
//		for(int i = 0; i<arr.length; i++)
//		{
//			arr[i] = rand.nextInt(100);
//		}
//		System.out.println(Arrays.toString(arr));
//		selection(arr);
//
//	}
//	
//	public static int [] selection(int [] arr)
//	{
//		int index = 0;
//		int small = arr[0];
//		for(int i=0; i<arr.length; i++)
//		{
//			if(arr[i]<small)
//			{
//				small=arr[i];
//				index=i;
//			}	
//		}
//		System.out.println(Arrays.toString(arr));
//		int temp = arr[0];
//		arr[0]=arr[index];
//		arr[index]=temp;
//		System.out.println(Arrays.toString(arr));
//		return arr;
		boolean puzzle2 = true;
		System.out.println(""
				+ "\n your able to go back at any point, as you walk down the long hallway, "
				+ "\n the lights grow dimmer as you near the stone door, its locked with two buttons on it, "
				+ "\n a Sun and a Moon, this must be some kind of code system to open the door, "
				+ "\n you look for clues around you");
		
		boolean correct =true;
		int moon =0;
		int sun =0;
		boolean [] arr = new boolean [5];
		boolean [] arr2 = new boolean [5];
		
		for(int i = 0; i<arr.length; i++)
		{
			if((rand.nextInt(2)+1)%2==0)
			{
			arr[i]=true;
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i]==true)
			{
				moon++;
			}
			else
			{
				sun++;
			}
		}
		System.out.println(""
				+ "\n The number "+ moon + " is writen in blood on the wall "
				+ "\n and the number " + sun + " is writen on the floor in blood");
		System.out.println("\n hit the moon or sun button");
		do
		{
			for(int i = 0; i<arr2.length; i++)
			{
				correct =true;
				String B = "";
				while(!B.equals("moon") || !B.equals("sun") || !B.equals("back"))
				{
					
					//System.out.println("\n Number of buttons pushed: " + i+1);
					B = scan.nextLine();
					B = B.toLowerCase();
					if(B.equals("moon"))
					{
						arr2[i]=true;
						break;
					}
					else if(B.equals("sun"))
					{
						arr2[i]=false;
						break;
					}
					else if(B.equals("back"))
					{
						
						return;
					}
					
				}
			}
			for(int i = 0; i<arr2.length; i++)
			{
				if(arr[i]!=arr2[i])
				{
					correct=false;
				}
			}
			if(correct==true)
			{
				System.out.println("\n correct, the door opens");
				puzzle2=false;
			}
			else if(correct==false)
			{
				System.out.println("\n Incorrect");
				System.out.println(Arrays.toString(arr));
				System.out.println(Arrays.toString(arr2));
			}
		}while(correct!=true);
	}
}
