package com.app.ojas4;

import java.util.Scanner;

public class Even {

	static int isEven(int num) {
		if(num<=0) {
			return -1;

		}
		else {
			if(num%2==0) {
				return 1;
			}
			else {
				return 0;

			}
		}


	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  Number ");
		int num1 = sc.nextInt();
		int rani = isEven(num1);
		System.out.println(rani);


	}
}
