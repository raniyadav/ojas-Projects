package com.app.Array04;

import java.util.Scanner;

public class RussianMultiplication {
	static int getProduct(int num1, int num2) {
		int total = 0;
		if((num1 <= 0) || (num2 <= 0)) {
			return -1;
		}
		else {
			if(num1 % 2 != 0)
				total = total+num2;
			while(num1 != 0) {
				num1 = num1 / 2;
				num2 = num2 * 2;
				if(num1 % 2 == 1) {
					total = total + num2 ;
				}
			}
			return total;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(getProduct(num1, num2));
	}

}
