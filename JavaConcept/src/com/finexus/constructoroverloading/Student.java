package com.finexus.constructoroverloading;

public class Student 
{
	private int studentId;
	public String studentName;
	public double studentPercentage;
	public static String schoolName;
	
	
//	public Student()
//	{
//		System.out.println("Just created Object ");
//	}

	public Student(int studentId)
	{
		this.studentId=studentId;
	}
	
//	public Student(double studentPercentage)
//	{
//		this.studentPercentage=studentPercentage;
//	}
		
	public Student(int studentId,String studentName)
	{
		this(studentId);
		this.studentName=studentName;
		
	}
	
	public Student(String studentName,int studentId)
	{
		this(studentId,studentName);
	}
	
	public void printStudentDetails()
	{
		System.out.println("student Id: "+studentId);
		System.out.println("student Name: "+studentName);
		System.out.println("student Salary: "+studentPercentage);
		System.out.println("Company Name: "+Student.schoolName);
		System.out.println("------------------------------------");
	}
	
	
}
