import java.util.Scanner;

public class Mainoct4 {

	public static void main(String[] args) 
	{
//		int i = 20;
//		while(i>10)
//		{
//			System.out.println(i++);
//		}

//		int i = 10;
//		do
//		{
//			System.out.println(--i);
//		}while(i>10);
		
		//create a program to be a bank app
		//the program will ask the user to select
		//1. check balance, 2. deposit, 3. withdraw, 4. exit
		//the code will continue to excute until exit is selected
		//this time we will actually create the code for check balance, deposit, and withdraw. 
		Scanner scan = new Scanner(System.in);
//		boolean bool = true;
//		int accountB = 200;
//		
//		do
//		{
//		System.out.println("1. check balance, 2. deposit, 3. withdraw, 4. exit");
//		int num = scan.nextInt();
//		switch(num)	
//		{
//		case 1:
//			System.out.println("Your balance is " + accountB);
//			break;
//		case 2:
//			System.out.println("How much would you like to deposit?");
//			int DP = scan.nextInt();
//			accountB = accountB+DP;
//			break;
//		case 3:
//			System.out.println("How much would you like to withdraw?");
//			int WD = scan.nextInt();
//			accountB = accountB-WD;
//			break;	
//		case 4:
//			System.out.println("Thank you have a nice day");
//			bool=false;
//			break;	
//		}
//		}while(bool);
		
		
		
	
		int accountB = 200;
		int num;
		do
		{
		System.out.println("1. check balance, 2. deposit, 3. withdraw, 4. exit");
		num = scan.nextInt();
		switch(num)	
		{
		case 1:
			System.out.println("Your balance is " + accountB);
			break;
		case 2:
			System.out.println("How much would you like to deposit?");
			int DP = scan.nextInt();
			accountB = accountB+DP;
			break;
		case 3:
			System.out.println("How much would you like to withdraw?");
			int WD = scan.nextInt();
			accountB = accountB-WD;
			break;	
		case 4:
			System.out.println("Thank you have a nice day");
			break;	
		}
		}while(num!=4);
	
	}

}
