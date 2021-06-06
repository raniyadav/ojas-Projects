package com.app.polymor;

import java.util.Scanner;


class Student{
	int stuno;
	String sname;
	Student(int stuno,String sname) {
		this.stuno = stuno;
		this.sname = sname;
		System.out.println(" parameterised constructor");
	}
	protected void dispStudentDetails() {
		System.out.println("NO : " +stuno);
		System.out.println("Name : " +sname);
	}
}
class Employee extends Student {
	double salary;
	double bonus;
	public Employee(int stuno,String sname,double salary, double bonus) {
		super(stuno,sname);
		this.bonus=bonus;
		this.salary=salary;
	}

	public void dispStudentDetails() {
		super.dispStudentDetails();
		System.out.println("Total salary : "+ (salary + bonus));
	}
}
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name,salary,bonus?");
		Student st = new Employee(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextDouble());
		st.dispStudentDetails();        
	}



}