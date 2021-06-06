package com.app.inner;

public class OuterDemo {
	int num1=10;
	class InnerDemo{
		int num2=20;
		InnerDemo(){
			System.out.println("num1= "+num1+" num2= "+num2);
		}
	}
	OuterDemo(){
		System.out.println("num1="+num1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterDemo ou=new OuterDemo();
		OuterDemo.InnerDemo de= ou.new InnerDemo();
	}

}
