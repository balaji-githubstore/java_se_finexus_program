package com.finexus.stringmethods;

public class Demo1 {

	public static void main(String[] args) {
		
		String name="Environmental Science";
		
		
//		int len=name.length();
//		System.out.println(len);
//		
//		char letter=name.charAt(0);
//		System.out.println(letter);
//		
//		String uName=name.toUpperCase();
//		System.out.println(uName);
//		
//		
//		System.out.println(name.toLowerCase());
//		
//		String output=name.substring(14);
//		System.out.println(output);
		
		int indexOfScience=name.indexOf("Science");
		System.out.println(indexOfScience);
		
		String output=name.substring(indexOfScience);
		System.out.println(output);
		
		System.out.println(name);
		
		//print only Environmental
//		indexOfScience=name.indexOf(" Science");
//		System.out.println(indexOfScience);
//		
//		output=name.substring(0, indexOfScience);
//		System.out.println(output);
		
		//end index will not be included
		output=name.substring(0, 2);
		System.out.println(output);
		
		name="Hello everyone";
		
		//System.out.println(name.equals("Hello Everyone"));
		
		
		if(name.equals("Hello Everyone"))
		{
			System.out.println("Matching!!");
		}
		
		if(name.equalsIgnoreCase("hello everyone"))
		{
			System.out.println("Matching!! Case insenstive comp");
		}
		
		if(name.contains("every"))
		{
			System.out.println("Every - word is present");
		}
		
		if(name.matches("(.*)every(.*)"))
		{
			System.out.println("Every - word is present - checking using regex");
		}
		
		name="                  Hello everyone               ";
		
		name=name.replace("Hello", "Hi");
		name=name.strip();
		
		System.out.println(name);
		
	
	}
}
