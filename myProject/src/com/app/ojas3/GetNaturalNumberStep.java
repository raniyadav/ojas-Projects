package com.app.ojas3;

import java.util.Scanner;

public class GetNaturalNumberStep {
	static String getNaturalNumbers(int num1, int num2, int step) {
		String output = "";
		
		if(num1 < 0 || num2 <0) {
			output += -1;
		}
		else if(num1 == 0 || num2 == 0) {
			output += -2;
		}
		else {
			while(num1 <= step) {
				output += num1 + " ";
				
				num1++;
			}
		}
		
		return output;
	}

public static void main(System args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println(sc.nextInt());
	}
}

