package com.app.polymor;

class BaseDemo{
	int a=10; 
}
public class DeriveDemo extends BaseDemo{

	int  b= 20;
	void disp(){
		System.out.println("a= "+super.a+ " b= " +a);

	}

	public static void main(String[] args) {
		DeriveDemo Dd=new DeriveDemo();
		Dd.disp();
	}

}
