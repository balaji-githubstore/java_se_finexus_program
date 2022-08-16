package com.finexus.exceptions;

public class Demo4 {

	public static void main(String[] args) {
		
	
		
		try
		{
			String name="king";
			
			System.out.println(name.charAt(50));
			
			int a=10;
			int b=0;
			
			System.out.println(a/b); //new ArithmeticException()
			
			int[] num=new int[2];
			
			System.out.println(num[10]); //new ArrayIndexOutOfBoundsException(e)
			


		}
		
		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (IndexOutOfBoundsException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (ArithmeticException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Done by Balaji Dinakaran");
		System.out.println("Code Ran!!!");
		
	}
}
