package com.app.constructor;

public class Student {
	int sno;
	String sname;
	Student(int sno,String sname){
		this.sno=sno;
		this.sname=sname;
	} 
	void displyStudent(){
		System.out.println("Sno "+sno);
		System.out.println("Sname "+sname);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st =new Student(1, "Rani");
		st.displyStudent();
		Student st1= new Student(11, "Raju");
		st1.displyStudent();
	}

}
