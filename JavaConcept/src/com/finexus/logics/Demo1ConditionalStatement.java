package com.finexus.logics;

public class Demo1ConditionalStatement {
	
	public static void main(String[] args) {
		
		int num=-10;
		
		if(num>0)
		{
			System.out.println(num+" is positive");
			System.out.println(num+" is positive");
		}
		else if(num==0)
		{
			System.out.println("It's zero");
		}
		else 
		{
			System.out.println(num+" is negative");
		}
		
		int pageNumber=250;
		
		if(pageNumber>=100 && pageNumber<=200)
		{
			System.out.println("Yes");
		}
		
		
		if(pageNumber>=100)
		{
			if(pageNumber<=200)
			{
				System.out.println("yes"); //10%
			}
			else {
				System.out.println("no- but greater than 100");//5 %
			}
		}
		
	}

}
