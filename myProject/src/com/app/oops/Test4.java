package com.app.oops;

 class Employee1{
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
	public    class Test4{
	
	public void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.accept(1, "shobha", 300000);
		emp.display();
	}	
			
	}


}