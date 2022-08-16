package com.finexus.collections;

import java.util.ArrayList;
import java.util.List;

import com.finexus.employee.Employee;

public class Demo5ArrayListGeneric {
	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		Employee emp3=new Employee();
		
		emp1.empId=101;
		emp1.empName="John";
		emp1.empSalary=8000;

		emp2.empId=102;
		emp2.empName="Peter";
		emp2.empSalary=5000;
		
		emp3.empId=103;
		emp3.empName="Paul";
		emp3.empSalary=8000;
		
		
		List<Employee> emps=new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
	}

}
