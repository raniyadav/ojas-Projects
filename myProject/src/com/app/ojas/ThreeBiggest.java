package com.app.ojas;

import java.util.Scanner;

public class ThreeBiggest {
	public static void main(String[] args) {
		int big;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value  x ");
		int x=sc.nextInt();

		System.out.println("enter the y value");
		int y=sc.nextInt();


		System.out.println("enter the z value");
		int z=sc.nextInt();


		if(x>y&&x>z) {
			System.out.println("Biggest value:"+x);

		}
		else if(y>z) {
			System.out.println("Biggest value:"+y);

		}
		else {
			System.out.println("big number is: "+z);

		}

	}
}

