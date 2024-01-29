import java.util.Arrays;
import java.util.Random;

public class arrys {

	public static void main(String[] args) 
	{
		
		
		Random rand = new Random();
		int [] arr = new int [10];
		
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]=rand.nextInt(10)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		//create an empty array
		//create a loop that fills it with the numbers 1-10
		//create another loop that finds the sum of all the numbers 
		
		int [] arr1 = new int [10];
		int total = 0;
		for(int i = 0; i<arr.length; i++)
		{
			arr1[i]=i+1;
		}
		for(int i = 0; i<arr1.length; i++)
		{
			total = total +arr1[i];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(total);
	}

}
