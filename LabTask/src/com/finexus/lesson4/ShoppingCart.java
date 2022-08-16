package com.finexus.lesson4;

public class ShoppingCart {
	
	public static void main(String[] args) {
		
		// Declare and initialize two String variables: custName as John and itemDesc as laptop.
		String custName="John"; //4*16 bits of memory 
		String itemDesc="laptop"; //6*16 bits of memory

        // Declare a String variable called message. Do not initialize it.
		String message;
               
        // Assign the message variable with a concatenation of the custName and itemDesc. 
		message=custName+" "+itemDesc;
        
        // Print message to the System output.
		System.out.println(message);
		
		
//		1. Declare and initialize numeric fields. Include price and tax (double), 
//	     quantity (int). Also declare a double called total, but do not initialize it.
		
		double price=100;
		double tax=0.18;
		int quantity=2;
		
		double total;
		
//		2. Change the message variable to include quantity 
//	      (example: "John wants to purchase 1 laptop")
		message=custName+" wants to purchase "+quantity+" "+itemDesc;
		//System.out.println(message);
		
		
//		3. Calculate total by multiplying price * quantity * tax.
		
		total=price*quantity*tax;
		
//		4. Print a message showing the total cost. 
//	      (example:  "Total cost with tax is: 25.78.")
		
		//System.out.println("Total cost with tax:"+total);
		
		
		
//		1. Declare a boolean, outOfStock, and initialize it to true.
		boolean outOfStock=false;
		
//		2. Use an if statement to test the value of quantity.  
//		    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
		if(quantity>1)
		{
		   message=message+"s";
		}
		
//		3. Use an if | else statement that tests the value of outOfStock.
//		    If true, let the user know the item is unavailable.
//		    If false, print the message variable, then print the total cost with tax.
		
		if(outOfStock)
		{
			System.out.println("Item is unavailable");
		}
		else
		{
			System.out.println(message);
			System.out.println("Total cost with tax:"+total);
		}
		
//		4. Run with outOfStock = true and then again with outOfStock = false.
		

	
	}
}
