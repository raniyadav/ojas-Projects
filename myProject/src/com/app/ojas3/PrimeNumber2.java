package com.app.ojas3;

import java.util.Scanner;

public class PrimeNumber2 {

		public static String checkPalindrome(int num) {
			int r ,sum=0,temp;
			temp = num;
			String res="";
			
			if(num<=0 ) {
				res="-1";
			}
			else if(num<=9) {
				res="-2";
			}   
			
			     	      while(num>0) {
	            	    r = num%10;
	       				sum = (sum*10)+r;
	       				num = num/10;
	            	   }
					
	               
	               
				if(temp==sum) {
					return "true";
				}
				else {
					return "false";
				}
				
				  
			}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter any Number  ");
			int num1 = sc.nextInt();
			String rani = checkPalindrome(num1);
			System.out.println(rani);
		}

	}


