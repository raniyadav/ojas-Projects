package com.app.oops;

public class Employee {
	private int empno;
	String ename;
	double salary;
	void accept( int empno, String ename,double salary){
		this.empno=empno;
		this.ename=ename;
		this.salary=salary;

	}
	void display(){
		System.out.println("empno"+empno);
		System.out.println("ename"+ename);
		System.out.println("salary"+salary);
	}
	public class Test{
		public static void main(String[] args) {
		Employee em=new Employee();
		em.accept(1, "Rani", 10000);
		em.display();
	}

}
}