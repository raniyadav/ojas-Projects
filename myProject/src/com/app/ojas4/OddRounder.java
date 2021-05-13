package com.app.ojas4;

import java.util.Scanner;

public class OddRounder {
	static int getNextMultipleOf100(int num) {
		int r = 0;
		int q = 0;

		if(num==0) {
			return -2;	
		}

		else if(num<0) {
			return -1;
		}

		else if(num %2==0) {
			return num;
		}

		else {
			if(num>0) {
				q = num/100;
				q = (q+1)*100;
			}
			return q;
		}//else
	}//static method


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int num = sc.nextInt();
		System.out.println(getNextMultipleOf100(num));
	}

}
