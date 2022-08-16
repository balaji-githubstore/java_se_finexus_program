package com.finexus.inheritance;

class Father{
	public int fAge;
	
	public Father(int fAge)
	{
		this.fAge=fAge;
		System.out.println("Father Constructor!!");
	}
	
	public void fatherStyle()
	{
		System.out.println("Father Style 123!!");
	}
	
}

class Son extends Father
{
	public int sAge;
	
	public Son(int fAge,int sAge)
	{
		super(fAge);
		this.sAge=sAge;
		System.out.println("Son Constructor!!");
	}
	
	public void sonStyle()
	{
		System.out.println("Son Style!!");
	}
}

//create class - GrandSon extends Son 
class GrandSon extends Son
{
	int gAge;

	public GrandSon(int fAge, int sAge,int gAge) {
		super(fAge, sAge);
		this.gAge=gAge;
		System.out.println("Grandson Constructor!!");
	}
	
	public void gsonStyle()
	{
		System.out.println("Grand Son Style!!");
	}
	
}

//in main method - create Object for Grandson and call the methods in father, son, grandson

public class InheritanceDemo2 {
	public static void main(String[] args) {
		
		
//		Father f=new Father();
		
//		Son s=new Son(60, 20);
//		
//		System.out.println(s.fAge);
//		System.out.println(s.sAge);
//		s.fatherStyle();
//		s.sonStyle();
		
		
		GrandSon gSon=new GrandSon(80, 50, 10);
		
		System.out.println(gSon.fAge);
		System.out.println(gSon.gAge);
		System.out.println(gSon.sAge);
		
		gSon.fatherStyle();
		gSon.sonStyle();
		gSon.gsonStyle();
		
	}

}
