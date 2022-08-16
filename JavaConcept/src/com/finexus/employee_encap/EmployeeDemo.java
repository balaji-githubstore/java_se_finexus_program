package com.finexus.employee_encap;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee.companyName = "Finexus";

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.setEmpName("John");
		emp1.setEmpSalary(5000);
		emp1.setEmpPhoneNumber(9889788888L);
		emp1.setEmpRating('C');
		

		emp2.setEmpName("Peter");
		emp2.setEmpSalary(6000);
		emp2.setEmpPhoneNumber(9889799998L);
		emp2.setEmpRating('B');

		emp3.setEmpName("Paul");
		emp3.setEmpSalary(5000);
		emp3.setEmpPhoneNumber(9889788898L);
		emp3.setEmpRating('D');
		
		
		emp1.displayEmployeeDetails();
		emp2.displayEmployeeDetails();
		emp3.displayEmployeeDetails();
		
		
		System.out.println(emp1.getNewSalary());
		System.out.println(emp2.getNewSalary());
		System.out.println(emp3.getNewSalary());
		
//		System.out.println(emp3.getEmpSalary());

	}

}
