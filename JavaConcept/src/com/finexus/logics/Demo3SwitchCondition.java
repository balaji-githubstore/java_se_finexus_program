package com.finexus.logics;

public class Demo3SwitchCondition {
	
	public static void main(String[] args) {
		
		
		String browser="ff";
		
		switch (browser) 
		{
			case "chrome":
				System.out.println("launch chrome");
				break;
			case "firefox": 
			case "ff":
			case "FFB":
				System.out.println("launch firefox");
				break;
			case "edge":
				System.out.println("launch edge");
				break;
			default:
				System.out.println("ie");
				break;
		}
		
		
	}

}
