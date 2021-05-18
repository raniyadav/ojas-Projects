package com.app.string;

public class Test1 {

	public static void main(String[] args) {

		//String str1="Hello";
		//String str2="Hello";

		String str1=new String("Hello");
		String str2 =new String("Hello");
		if(str1==str2){
			System.out.println("both are same");

		}
		else{
			System.out.println("Not same");
		}
		if(str1.equals(str2)){
			System.out.println("both are same");
		}
	}

}
