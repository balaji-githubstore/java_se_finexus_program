package com.finexus.constructoroverloading;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student.schoolName="Global School";
		
//		Student stu=new Student();
		
		Student stu1=new Student(101);
		Student stu2=new Student(102);
		Student stu3=new Student(102,"Bala");
		Student stu4=new Student("Bala",102);
//		stu1.studentId=1001;
		stu1.studentName="Kevin";
		stu1.studentPercentage=85.3;
		
//		stu2.studentId=1002;
		stu2.studentName="Patrick";
		stu2.studentPercentage=65.52;
		

		stu1.printStudentDetails();
		stu2.printStudentDetails();
		
		
	}

}
