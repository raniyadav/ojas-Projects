package com.app.ojas4;

import java.util.Scanner;

public class Greatest {
	static int getGreatest1(int num1 , int num2) {


		if(num1 < 0||num2<0) {
			return  -1;	
		}

		else if(num1 ==0||num2==0) {
			return -2;
		}

		else {
			if(num1>num2) {

				return num1;
			}
			return num2;

		}}	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			int rani = getGreatest1(num1,num2);
			System.out.println(rani);

		}//main

}//class
