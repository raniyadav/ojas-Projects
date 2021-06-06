package com.app.dd;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
System.out.println("Enter Your AcountNo,balance,"+"interestRate?");
		
		int accountNo=sc.nextInt();
		int balance =sc.nextInt();
		int sno=sc.nextInt();
		Account ac= new Account();
		Customer cs= new Customer();
		System.out.println(cs);
		System.out.println(ac);
	}


		
	}


