package com.app.Array;

import java.util.Scanner;

public class PrimeNumber2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers : ");
		System.out.println(getPrimeNumbers(sc.nextInt(), sc.nextInt()));
	}
	public static int getPrimeNumbers(int n1,int n2)
	{
		int r ,sum=0;
		int res = 0 ;
		if(n1<0 || n2<0){
			res=-1;
		}else if(n1==n2){
			res=-2;
		}else if(n1<=n2){
                      res=-3;	
                      }

	      while(n1>0) {
	      r = n1%10;
			sum = (sum*10)+r;
			n1 = n1/10;
			n2 = n2/10;
	   }

		return res;
	}
	
}
