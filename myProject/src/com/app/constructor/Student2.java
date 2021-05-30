package com.app.constructor;

import java.util.Scanner;


public class Student2 {
	int sno;
	String sname;
	Student2(int sno,String sname){
		this.sno=sno;
		this.sname=sname;
	}
	void displyStudent(){
		System.out.println("Sno "+sno);
		System.out.println("Sname "+sname);
	}

	public static void main(String[] args) {
	Student studes[] =new Student[5];
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<studes.length;i++){
		System.out.println("Enter "+(i+1)+"student no name");
	
	}
	System.out.println("Student info as follows");
	for(int i=0; i<studes.length;i++){
		studes[i].displyStudent();
	}
	}
}
