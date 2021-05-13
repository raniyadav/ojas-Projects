package com.app.ojas4;

import java.util.Scanner;

public class SquareCube {

	static int calculate(int num) {
			if(num<=0) {
				return -1;
			}
			else {
				if(num%2==0) {
					return num*num;
				}
				return num*num*num;
			}
			
		}
	 
		public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter any  Number ");
				int num1=sc.nextInt();
				int rani=calculate(num1);
				System.out.println(rani);
				

			}

		

		}

