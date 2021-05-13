package com.app.ojas;

public class CMD {

	public static void main(String[] args) { 
		System.out.println("Four variable " +args[0]+args[1]+args[2]+args[3]);
		
		int a=Integer.parseInt(args[0]+args[1]);
		int b=Integer.parseInt(args[2]+args[3]);

		System.out.println("sum of c = "+(a+b));
	}

}