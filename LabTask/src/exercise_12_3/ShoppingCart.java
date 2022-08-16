/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package exercise_12_3;



public class ShoppingCart {
	public static void main(String args[]) {
		// Declare and instantiate a Shirt object using an Item reference type instead
		Item item = new Shirt(25.99, 'M', 'Y');

		// Call the display method on the object, then the getColor method
		item.display(); // Runtime polymorphism


	//item=new Trouser();
	
		if(item instanceof Shirt)
		{
			Shirt shirt=  (Shirt) item;
			String color=shirt.getColor();
			System.out.println("\tColor: "+color);
		}
		else {
			System.out.println("Item is not an instance of Shirt");
		}
		
		//I can also call method present in child class only
	

		

		
	}
}
