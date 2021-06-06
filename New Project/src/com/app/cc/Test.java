package com.app.cc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter Your no,name,hno,"+"colname,cityname?");
		
		int sno=sc.nextInt();
		String sname=sc.next();
		String hno=sc.next();
		String colName=sc.next();
		String cityName=sc.next();
		
		Address ad=new Address(hno, colName, cityName);
		Student st= new Student(sno, sname,ad );
		System.out.println(st);
	}
}


