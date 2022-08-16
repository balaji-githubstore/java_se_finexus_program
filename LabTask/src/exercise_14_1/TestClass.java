/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package exercise_14_1;

public class TestClass {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int addResult = calc.add(43, 79);
		System.out.println("Add Result: " + addResult);

		// Add exception handling to catch ArithmeticException
		double divResult=0;
		
		try {
			divResult = calc.divide(15, 0);
			System.out.println("Division Result: " + divResult);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		System.out.println(divResult);
	}
}
