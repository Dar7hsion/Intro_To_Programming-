
public class main {

	public static void main(String[] args) 
	{
		//do matrix addition
		//both array must be the same dimension
		int count = 1;
		int [][] arr=new int [3][3];
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j =0; j<arr[i].length; j++)
			{
				arr[i][j]=count++;
			}
		}
		
//		for(int i = 0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr[i].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int[][]arr2 = {{2, 4, 6}, {4, 6, 8}, {6, 8, 10}};
		
		int[][]arr3 = new int [arr.length][arr[0].length];
		
		if(arr.length==arr2.length && arr[0].length==arr2[0].length)
		{
			for(int i = 0; i<arr.length; i++)
			{
				for(int j=0; j<arr[i].length; j++)
				{
					arr3[i][j]=arr[i][j]+arr2[i][j];
				}
			}
		}
		else
		
		for(int i = 0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3[i].length; j++)
			{
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
