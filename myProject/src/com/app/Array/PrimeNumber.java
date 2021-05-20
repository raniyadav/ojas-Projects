package com.app.Array;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		System.out.println(getPrimeNumbers(sc.nextInt(), sc.nextInt()));
	}
	public static String getPrimeNumbers(int num1,int num2)
	{
		int r ,sum=0;
		String res =" ";
		if(num1>0 && num2>0){
			res=-1+"";
		}else if(num1<=num2){
			res=-2 +"";
		}else{
			System.out.println("primeNumber");
		}

	      while(num1>0) {
	      r = num1%10;
			sum = (sum*10)+r;
			num1 = num1/10;
			num2 = num2/10;
	   }

		return res;
	}
	
}
