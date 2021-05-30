package com.app.basic;
public class SwapNumbers
{
	public static void main(String[] args)
	{
		int num1= 10; int num2= 20;
		System.out.println("Original values before swapping are:");
		System.out.println("Value of number 1 is " +num1); System.out.println("Value of number 2 is " +num2);
		num1 = num1- num2; num2 = num1 +num2;
		num1 = num2- num1;
		System.out.println("Values after swapping are:");
		System.out.println("Value of number 1 is " +num1); System.out.println("Value of number 2 is " +num2);
	}
}