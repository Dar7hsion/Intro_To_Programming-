
public class algnov22 {

	public static void main(String[] args) 
	{
		
		//scalar multiplication
		//define a scalar (single number)
		//define a 2D array
		//multiply them together
		//print results
		
		int count = 1;
		int [][] arr=new int [3][3];
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				arr[i][j]=count++;//incroments it up after 
			}
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				arr[i][j]=(arr[i][j])*5;
			}
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
