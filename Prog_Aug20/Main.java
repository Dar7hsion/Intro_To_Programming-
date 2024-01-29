
public class Main {

	public static void main(String[] args) 
	{

		//convert celcius to fahranheight
		//(x -32) * (5/9) = y
		
		//x-32   = y/(5/9)
		//x = y/(5/9) + 32
		
		//(C × 9/5) = F-32

		
		//Take celcius divided by 5/9
		double celcius = 100;
		double fahrenheit;
				
		fahrenheit = celcius / (5/9.0);		
				
				
		//add 32 to the new value to get the fahranhight temp
		//say the celcius temp is 100
		
	
		fahrenheit = fahrenheit + 32;
				
		System.out.println("farenheit: " + fahrenheit);
	
		
		
		//calculate the cost after sales tax (sales tax = 0.88)
		
		//purchases before tax add up to 80.95
		//find the price after the sales tax is added
	
		//(cost*.88) + cost
		double cost = 80.95;
		double tax = .08;
		
		double taxAmount = cost * tax;
				
		double total = cost + taxAmount;		
		
		System.out.println("Total cost: " + total);
		
		
		
	}

}
