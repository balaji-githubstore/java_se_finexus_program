package com.finexus.datatypes;

public class Demo3 {
	
	public static void main(String[] args) {

		float a=10.2f; //32 bit
		
		double b=a; //32 bit into 64 bits //implicit conversion 
		
		
		float x1=(float) b; //64 bit to 32 bit //explicit conversion //there might be data loss
		
		System.out.println(b);
		
		
		int z=(int) b; //64 bit to 32 bit  //explicit conversion //there might be data loss
		System.out.println(z);
		
		double g=10.0;
		
		int k=(int) g;
		
		System.out.println(k);
		
		int x = 4, y = 9;
		
		//System.out.println(y/x);
		
		//x=x+y;
		System.out.println(x);
		
		x *=y;  //represent x=x+y
		
		//x -=y; //represent x=x-y
		
		System.out.println(11%5); //mod operator // give remainder
	}

}
