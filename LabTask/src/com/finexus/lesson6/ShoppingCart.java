package com.finexus.lesson6;

public class ShoppingCart {

	public static void main(String[] args) {
		
		Item item1=new Item();
		Item item2=new Item();
		
		item1.descr="Laptop";
		item2.descr="Mobile";
		
		item1=item2;
		
		System.out.println("Item 1 Description: "+item1.descr);
		System.out.println("Item 2 Description: "+item2.descr);
		
	}
}
