package com.finexus.stringbuilder;

public class Demo1 {

	public static void main(String[] args) {

		// immutable
		String color = "red";

//		color = "yellow";
//		color = "blue";
		color = color + " color"; // immutable so it will create new memory and then load blue color

		System.out.println(color);
		

		//mutable 
		StringBuilder strBuilder = new StringBuilder("red");
		strBuilder.append(" color");

		System.out.println(strBuilder);
		
		strBuilder.insert(0, "The ");
		
		System.out.println(strBuilder);

	}

}
