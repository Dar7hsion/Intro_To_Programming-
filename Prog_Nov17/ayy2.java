import java.util.Arrays;
import java.util.Random;

public class ayy2 {

	public static void main(String[] args) 
	{
		//create an array
				//fill the arry with random number
				//loop throught and find the smallest number 
				//swap that number with first element of the array
				
				Random rand = new Random();
				
				int [] arr = new int [12];
				
				for(int i = 0; i<arr.length; i++)
				{
					arr[i] = rand.nextInt(100);
				}
				System.out.println(Arrays.toString(arr));
				
				
				
				
				for(int j = 0; j<arr.length; j++)
				{
					int index = j;
					int small = arr[j];
					for(int i=j; i<arr.length; i++)
					{
						if(arr[i]<small)
						{
							small=arr[i];
							index=i;
						}
					}
					System.out.println(" smallest element " + small + " at index " + index);
					int temp = arr[j];
					arr[j]=arr[index];
					arr[index]=temp;
					System.out.println(Arrays.toString(arr));
				}
				

	}

}
