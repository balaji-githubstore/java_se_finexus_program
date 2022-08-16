package com.finexus.loops;

public class Demo4 {

	public static void main(String[] args) {
		
//search for 5 and come out of loop
		//1 to 10
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				continue;  //goto next iteration basically 6
			}
			
			System.out.println(i);
		}
		
	
	}
}
