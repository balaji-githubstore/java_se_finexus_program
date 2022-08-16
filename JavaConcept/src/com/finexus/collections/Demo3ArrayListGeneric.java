package com.finexus.collections;

import java.util.ArrayList;

public class Demo3ArrayListGeneric {

	public static void main(String[] args) {
		

		//size is dynamic
		//when need to manipulate the collections then ArrayList is preferred. 
		
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		colors.add("orange");
		colors.add("black");
		
		System.out.println(colors.size());
		System.out.println(colors);
		
		System.out.println(colors.get(0));
		
//		colors.remove(1);
		colors.remove("yellow");
		
//		for(int i=0;i<colors.size();i++)
//		{
//			System.out.println(colors.get(i));
//		}
		System.out.println("*************FINAL LIST *******************");
		for(String color : colors)
		{
			System.out.println(color);
		}
	}
}
