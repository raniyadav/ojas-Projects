package com.app.oops;
class EMployee {
private int empno,salary1;;
private String empName;

public void setEmpName(String empName) {
	this.empName = empName;

}
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}

public int getSalary1() {
	return salary1;
}
public void setSalary1(int salary1) {
	this.salary1 = salary1;
}
public String getEmpName() {
	return empName;
}


	@Override
public String toString() {
	return "Employee1 [empno=" + empno + ", salary1=" + salary1 + ", empName="
			+ empName + ", getEmpno()=" + getEmpno() + ", getSalary1()="
			+ getSalary1() + ", getEmpName()=" + getEmpName() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
}
