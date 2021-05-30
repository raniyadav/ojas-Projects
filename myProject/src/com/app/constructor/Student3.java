package com.app.constructor;

import java.util.Scanner;

public class Student3 {
	public int studentId;
	public String studentName;
	private int marks;
	private char grade;

	Student3(){
		System.out.println("Student information");
	}
	Student3(int studentId,String studentname,int marks){
		this();
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;

	}
//	public String displayDetails(){
//		grade= calcutateGrade();
//		return "[studentname="+studentName+",studentId="+studentId+",marks="+marks+",grade"+grade+"]";
//
//	}
	
	private char calcutateGrade() {
		if(marks>90){
			grade ='A';
		}else if(marks<90&&marks>80){
			grade ='B';
		}else if(marks<80&&marks>70){
			grade='c';
		}else if(marks<70&&marks>60){
			grade='D';

		}else{
			grade='E';
		}
		return grade;
	}
	public static void main(String[] args) {

		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter Student id:");
		int id=sc.nextInt();
		System.out.println("Enter Student name");
		String sname=sc.next();
		System.out.println("Enter Student marks");
		int marks=sc.nextInt();
		Student3 student=new  Student3(id,sname,marks);

	}
	@Override
	public String toString() {
		return "Student3 [studentId=" + studentId + ", studentName="
				+ studentName + ", marks=" + marks + ", grade=" + grade
				+ ", calcutateGrade()=" + calcutateGrade() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
