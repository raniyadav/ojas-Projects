package com.app.oops;

class Employee {
	private int empNo;
	private String ename;
	private double salary;

	Employee(int empNo, String ename, double salary) {
		this.empNo = empNo;
		this.ename = ename;
		this.salary = salary;
	}

	public int hashCode() {
		return empNo;
	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		return this.empNo == e.empNo && this.ename.equals(e.ename)
				&& this.salary == e.salary;
	}

	public String toString() {
		return empNo + " " + ename + " " + salary;
	}
}

public class Test3 {

	public static void main(String[] args) {

		Employee obj = new Employee(10, "Ramu", 30000);

		Employee obj1 = new Employee(11, "Nirmala", 30000);

		Employee obj2 = new Employee(11, "Nirmala", 30000);

		System.out.println(obj1 == obj2);

		System.out.println(obj1.equals(obj2));

	}

}