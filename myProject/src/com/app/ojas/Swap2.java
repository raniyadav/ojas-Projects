package com.app.ojas;

import java.util.Scanner;

public class Swap2 {
	public static void main(String[] args) {
		int big;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value  x ");
		int x=sc.nextInt();

		System.out.println("enter the y value");
		int y=sc.nextInt();

		if(x>y) {
			big=x;

		}
		else {
			big=y;

		}
		System.out.println("big number is: "+(big));

	}
}