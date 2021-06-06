package com.app.polymor;
public class Demo {
	void sum() {
		System.out.println("Welcome");
	}
	void sum(int a,int b) {
		System.out.println("SUM = " + (a + b));
	}
	double sum(double a,double b,double c) {
		return a + b + c;
	}
	String sum(String s1,String s2) {
		return s1 + s2;
	}



	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.sum();
		obj.sum(10, 20);
		System.out.println(obj.sum("Hello", "Welcome"));
		System.out.println("sum = " +obj.sum(23.45, 34.5,6.7));

	}



}
