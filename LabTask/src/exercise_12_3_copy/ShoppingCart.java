/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package exercise_12_3_copy;



public class ShoppingCart {
	public static void main(String args[]) {
		// Declare and instantiate a Shirt object using an Item reference type instead
		Item item = new Shirt(25.99, 'M', 'Y');

		// Call the display method on the object, then the getColor method
		item.display(); // Runtime polymorphism

	
		//I can also call method present in child class only
		Shirt shirt=  (Shirt) item;
		String color=shirt.getColor();
		System.out.println("\tColor: "+color);

		
		System.out.println(item instanceof Shirt);
		System.out.println(item instanceof Trouser);
		
		Item item1=new Trouser();
		
		System.out.println(item1 instanceof Shirt);
		System.out.println(item1 instanceof Trouser);
		
	}
}
