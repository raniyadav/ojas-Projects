package com.app.string;

import java.util.Scanner;

public class DisplyTheVowels {

	static void getVowels(String str){

		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
			{
				System.out.println("Display the vowels " + str.charAt(i));
			}
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the String");

		String str = sc.next();
		getVowels(str);
	}
}