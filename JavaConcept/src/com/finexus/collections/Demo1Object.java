package com.finexus.collections;

import com.finexus.employee_encap.Employee;

public class Demo1Object {
	
	public static void main(String[] args) {
		
		
		
		int a=10;
		double b=20.3;
		String name="bala";
		Employee e=new Employee();
		
		Object z1=a;  //boxing --> converting to object type 
		Object z2=b;
		Object z3=name;
		Object z4=e;
		
		
		int x1=(int) z1; //unboxing --> converting to respective datatype
		System.out.println(x1+x1);
		
		double x2=(double) z2;
		System.out.println(x2);
		
		Employee emp=(Employee) z4;
		System.out.println(emp.getEmpId());
	}

}
