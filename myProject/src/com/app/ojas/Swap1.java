package com.app.ojas;

import java.util.Scanner;

public class Swap1 {
	public static void main(String[] args) {
		int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value  x ");
		x=sc.nextInt();
		
		System.out.println("enter the y value");
		y=sc.nextInt();
		
		System.out.println("before swapping values " +x+ ""+y);

		t=x;
		x=y;
		y=t;
		System.out.println("after swapping  "+ x+ ""+y);
	}

}
