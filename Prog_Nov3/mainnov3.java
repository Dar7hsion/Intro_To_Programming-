import java.util.Scanner;

public class mainnov3 {

	public static void main(String[] args) 
	{
		
		//Armstrong Number
		//take in a number from the user
		//pass this number to your function
		//the function will return true if the number is an armstrong number 
		//and false if it is not
		
		//armstrong number are numbers where the cube of each digit added together is the original number 
		
		//note: conversion between characters and ints may be useful here
		//either that or you can modulo, both should work
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input a number bellow and i will tell you if this number is an armstrong number");
		
		String arm = scan.nextLine();
		
		System.out.println(Arm(arm));
		
		

	}
	
	public static boolean Arm(String arm)
	{
		Boolean bool = false;
		int total = 0;
		
		for(int i=0; i<arm.length(); i++)
		{
			int current=(int) arm.charAt(i);
			total += current*current*current;
			
		}
		
		String str = "" + total;
		if(arm.equals(str))
		{
			bool = true;
		}
		return bool;
		
		
	}

}
