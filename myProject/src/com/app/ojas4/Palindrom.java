package com.app.ojas4;

import java.util.Scanner;

public class Palindrom {

	static int isPalindrome(int num) {
		int r ,sum=0,temp;
		temp = num;

		if(num<=0 ) {
			return -1;
		}

		if(num<=99||num>=999) {
			return -2;
		}

		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}



		if(temp==sum) {
			return -1;
		}
		else {
			return 0;
		}


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number  ");
		int num1 = sc.nextInt();
		int rani = isPalindrome(num1);
		System.out.println(rani);
	}

}


