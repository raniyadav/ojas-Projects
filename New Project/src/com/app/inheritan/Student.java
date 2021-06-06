package com.app.inheritan;

import java.util.Scanner;

public class Student {
	protected int studentId;
	private String sName;
	protected double examFee;
	Student(){
		
	}

	public Student(int studentId, String sName, double examFee) {
		super();
		this.studentId = studentId;
		this.setsName(sName);
		this.examFee = examFee;
	}
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + getsName()
				+ ", examFee=" + examFee + "]";
	}

 String displayDetais(){
	//System.out.println("sName=" +sName+" studentId= "+studentId+"examfee="+examFee+"");
	return toString();
}
 //double payfee(int amount){
//	 return(super-payfee(amount)+transportFee)-amount; 
 //}

public String getsName() {
	return sName;
}

public void setsName(String sName) {
	this.sName = sName;
}

 }