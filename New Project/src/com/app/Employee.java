package com.app;

public class Employee {
int empNo;
String empName;
int  salary;

public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String toString() {
	return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary="
			+ salary + ", getEmpNo()=" + getEmpNo() + ", getEmpName()="
			+ getEmpName() + ", getSalary()=" + getSalary() ;
}
					
 
}
