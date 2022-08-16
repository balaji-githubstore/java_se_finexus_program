package com.finexus.datatypes;

public class Demo1Datatypes {
	
	public static void main(String[] args) {
		
		byte a=100; //occupy 8 bits of memory
		short b=100; //occupy 16 bits of memory
		int c=0;//occupy 32 bits of memory
		long d=99898998955L; //occupy 64 bits of memory
		
		c=a; //implicit conversion // byte to int 
		
		float e=1.123456789f;
		double f=1.123456789;
		
		char letter='B';
		
		boolean check=true;
		
		System.out.println(a);
		System.out.println(e);
		System.out.println(f);
		
		f=c; //implicit conversion // int to double
		
		
		System.out.println(letter);
		
		//Declare int datatype with value as 50 
		//Declare int datatype with value as 20
		//add the value and store in result variable 
		
		double num1=50.2; 
		int num2=20;
		
		double result=num1+num2;
		System.out.println("The result is "+result);
		
		
		float v=1.123456789f;
		
		double o=1.123456789;
		System.out.println(o);
		
		v=(float) o; //double to float //explicit conversion // which might lead to data loss
		
		System.out.println(v);
		
		int x=11;
		int y=2;

		double output=(double)x/y;	
		System.out.println(output);
		
		String name="balaji"; //6*16 bits of memory 
		
		System.out.println(name);
		
		System.out.println(name.length());
		
		System.out.println(name.toUpperCase());
		
		
		System.out.println(name.charAt(5));
		
	}

}




