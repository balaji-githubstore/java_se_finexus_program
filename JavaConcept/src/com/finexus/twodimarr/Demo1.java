package com.finexus.twodimarr;

public class Demo1 {
	
	public static void main(String[] args) {
		
		
		int[] number= {10,20,30,40,50};
//		int[] number= new int[5];
		System.out.println(number);
		System.out.println(number.length);
		System.out.println(number[0]);
		
		
		int[][] arr= {{10,20},{30,40},{50,60}};
		
		System.out.println(arr[0][1]);
		
		
		
		int[][] arr1=new int[3][2]; 
		arr1[0][0]=10;
		arr1[0][1]=20;
		
		arr1[1][0]=30;
		arr1[1][1]=40;
		
		arr1[2][0]=50;
		arr1[2][1]=60;
		
		System.out.println(arr1[0][1]);
		
		//create array to keep {john,john123,john@GMAIL.COM} {peter,peter123,peter@GMAIL.COM} 
		
		String[][] arr2= {{"john","john123","john@GMAIL.COM"},{"peter","peter123","peter@GMAIL.COM"}};
		
		System.out.println(arr2.length);
		System.out.println(arr2[0].length);
		
		System.out.println(arr2[1][2]);
		
		Object[] arr3= {78,"ss",8752.2,true};
		
		Object[][] arr4= {{"john","john123",787887},{"peter","peter123",878787}};
		
	}

}
