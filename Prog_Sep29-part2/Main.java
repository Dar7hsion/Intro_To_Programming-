
public class Main {

	public static void main(String[] args) 
	{
		
		int num = 8;
		
		while(num>0)
		{
			if(num%2==0)
			{
				System.out.println(num);
				//--,++ and go before or after num, if before it will subtract or add before.
			}
			num--;
		}
		System.out.println();
		
		int x = 5;
		int y = 5;
		while(x>0)
		{
			y=5;
			while(y>0)//5
			{
				System.out.print(" y: " + y--);
			}
			System.out.println(" x: " + x--);
			
		}
		System.out.println();
		
	//loop 0-05 printing out every multiple of five
	//ie) 5, 10, 15, .....
		
		int I = 0;
		
		while(I>=0 && I<=50)
		{
			if(I%5==0)
			{
				System.out.print(I + ", ");
			}
			I++;
			
		}
		System.out.println();
		
		int V = 0;
		
		while(V>=0 && V<=50)
		{
			if(V%5==0)
			{
				if(V<=49)
				{
					System.out.print(V + ", ");
				}
				else if(V==50)
				{
					System.out.print(V);	
				}
			}
			V++;
		}
			
			
		
	}

}
