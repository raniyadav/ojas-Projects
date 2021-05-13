package com.app.ojas4;

import java.util.Scanner;

public class EvenorOdd {

	static String isEvenOrOdd(int num) {
		String Even,Odd,InvalidInput;
		if(num<=0) {

			return "InvalidInput";

		}
		else {
			if(num%2==0) {
				return "Even";
			}
			else {
				return "Odd";

			}
		}


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  Number ");
		int num1 = sc.nextInt();
		String rani = isEvenOrOdd(num1);
		System.out.println(rani);


	}

}
