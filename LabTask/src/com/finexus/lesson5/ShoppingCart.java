package com.finexus.lesson5;

public class ShoppingCart {

	public static void main(String[] args) {
		String custName = "Mary Smith";
		
        String message = custName + " wants to purchase several items.";
 
        // Declare and initialize the items String array with 4 item descriptions.
        String[] items=new String[4];
        items[0]="shirt";
        items[1]="watch";
        items[2]="Mobile";
        items[3]="Wallet";
        
        // Change message to show the number of items purchased.
        message=custName+" wants to purchase "+items.length+" items";
        System.out.println(message);
        
        // Print an element from the items array.

       // System.out.println(items[3]);
        
//        1. Create a for loop that iterates through the items array,
//        displaying each element. Precede the list of elements with 
//        the message, "Items purchased: ".
        
        //for loop
        for(int i=0;i<items.length;i++)
        {
        	System.out.println("Items purchased: "+items[i]);
        }
        
        
        //for each loop as well
        for(String item : items)
        {
        	
        	System.out.println("Items purchased: "+item);
        }
        
//        for(String itemsPur: items) {
//            message=custName+" wants to purchase "+itemsPur+" items";
//           
//            System.out.println(message);
//           
//        }
	}
}
