package com.finexus.stringmethods;

public class Demo3 {
	
	public static void main(String[] args) {
		
		String name="Balaji Dinakaran";	
		String[] arr=name.split(" ");
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		String mailid="jack_10@gmail.com";
		
		//write logic to print only the name jack_10
		
		System.out.println(mailid.split("@")[0]);
	}

}
