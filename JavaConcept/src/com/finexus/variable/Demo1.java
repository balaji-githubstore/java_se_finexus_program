package com.finexus.variable;

public class Demo1 {

	public static int aS=10; //static variable or class variable
	public static int bS=20;
	
	public int aNS=10; //non-static variable or instance variable 
	public int bNS=20;
	
	
	public static void main(String[] args) {
		
		Demo1.aS=200;
		System.out.println(Demo1.aS);
		
		Demo1 obj1=new Demo1();  //instance 
		System.out.println(obj1);
		
		Demo1 obj2=new Demo1(); //instance 
		System.out.println(obj2);
		
		Demo1 obj3=new Demo1(); //instance 
		System.out.println(obj3);
		
		obj2.bNS=500;
		
		obj3=obj2;
		
		System.out.println("------------------------------------");
		
		System.out.println(obj1);
		System.out.println(obj1.aNS); //10 
		System.out.println(obj1.bNS); //20
		
		System.out.println("------------------------------------");
		
		System.out.println(obj2);
		System.out.println(obj2.aNS); //10
		System.out.println(obj2.bNS);//500
		
		System.out.println("------------------------------------");
		
		System.out.println(obj3);
		System.out.println(obj3.aNS);//10
		System.out.println(obj3.bNS);//500
		
		System.out.println("------------------------------------");
	}
	
	
	
}