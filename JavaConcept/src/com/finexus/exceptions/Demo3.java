package com.finexus.exceptions;

public class Demo3 {

	public static void main(String[] args) {

		try {
			String name = "king";

			System.out.println(name.charAt(3));

			int a = 10;
			int b = 10;

			System.out.println(a / b); // new ArithmeticException()

			int[] num = new int[2];

			System.out.println(num[10]); // new ArrayIndexOutOfBoundsException(e)

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		finally {
			System.out.println("Done by Balaji Dinakaran");
			System.out.println("Code Ran!!!");
			// close db connections

		}

	}
}
