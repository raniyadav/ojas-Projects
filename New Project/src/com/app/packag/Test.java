package com.app.packag;
class Calculator{
	void sum(int a ,int b){
		System.out .println("Sum ="+(a+b));
	}
	void sub(int a ,int b){
		System.out .println("Sum ="+(a-b));
	}
}
public class Test{
	public static void main (String args[]){
		Calculator obj= new Calculator();
		obj.sum(10,20);
		obj.sub(34,21);
	}
}