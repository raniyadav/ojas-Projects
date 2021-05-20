package com.app.ojas3;

import java.util.Scanner;

public class PrimeNumber{

	public static String checkPrime(int num) {
		boolean b = false;

		String res="";
		int count=0;
			if(num==0||num==1){
				res="-2";
			}
			else if(num<0){
				res="-1";
			}


		else
		{


			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}

		}
		if(count==2) {
			return "true";
		}
		return "false";
	}

	public static void main(String args[]) {
		System.out.println("enter num");
		Scanner sc=new Scanner(System.in);
		System.out.println(checkPrime(sc.nextInt()));
	}
}

