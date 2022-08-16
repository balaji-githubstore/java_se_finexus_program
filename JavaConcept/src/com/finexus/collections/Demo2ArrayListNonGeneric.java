package com.finexus.collections;

import java.util.ArrayList;

public class Demo2ArrayListNonGeneric {

	public static void main(String[] args) {
		
		//store all record as an Object type
		//size is dynamic
		ArrayList lists=new ArrayList();
		
		lists.add(45);//boxing
		lists.add(45.2);
		lists.add("John");
		
		int x=(int) lists.get(0);//unboxing
		double y=(double) lists.get(1);
		String z=(String) lists.get(2);
		
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
