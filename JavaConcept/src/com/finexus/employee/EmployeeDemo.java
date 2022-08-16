package com.finexus.employee;

import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		Employee.companyName="Finexus";
		
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

//		emp1.displayEmployeeDetails();
//		emp2.displayEmployeeDetails();
//		emp3.displayEmployeeDetails();
		
		
		Employee[] employees=new Employee[3];
		employees[0]=emp1;
		employees[1]=emp2;
		employees[2]=emp3;
		
		Employee.displayAllEmployeeDetails(employees);

//		emp1.empId=1001;
//		employees[0].empId=20001;
		
		//size is dynamic
		ArrayList<Employee> emps=new ArrayList<Employee>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
	}

}
