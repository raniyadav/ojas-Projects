package com.app.inner;

public class OuterDemo1 {
 static class InnerDemo{
	 static void disp(){
		 System.out.println("welcome");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterDemo1.InnerDemo.disp();

	}

}
