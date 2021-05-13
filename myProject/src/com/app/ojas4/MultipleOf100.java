package com.app.ojas4;

import java.util.Scanner;

public class MultipleOf100 {
	static int getNextMultipleOf100(int num) {
		int r = 0;
		int q = 0;
		q = num/100;
		q = (q+1)*100;
		if(num>0) {
			r=q;
		}else {
			return -1;

		}

		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int num = sc.nextInt();
		System.out.println(getNextMultipleOf100(num));
	}

}
