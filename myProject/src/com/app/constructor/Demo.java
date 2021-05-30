package com.app.constructor;

public class Demo {
	Demo(){
		System.out.println("Default Construtor");
	}
	Demo(int num1){
		this();
		System.out.println("one parameter Constructor");
	}
	Demo(int num1,int num2){
		this();

		System.out.println("Two parameter construtor");
	}
	Demo(int num1,int num2,int num3){
		this();
		System.out.println("Three parameter constructor");
	}
	public static void main(String[] args) {
		Demo dm= new Demo(10,20,30);
	}

}
