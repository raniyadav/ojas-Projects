package com.app.ojas4;

import java.util.Scanner;

public class Demo1 {

	static String disTable(int num) {
		String res="";
		for(int i=1; i<=10;i++) {
			res +=num+"*"+i+"=*"+(num*i)+"\n";
		}
		return res;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the Number");
		System.out.println(disTable(sc.nextInt()));

	}
}
