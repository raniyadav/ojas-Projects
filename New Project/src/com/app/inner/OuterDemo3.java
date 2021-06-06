package com.app.inner;

interface Arithoperation{
	void sum( int a ,int b);
}
public class OuterDemo3 {

	public static void main(String[] args) {
		Arithoperation obj=new Arithoperation(){

			public void sum( int a ,int b) {
				System.out.println(a+b);
			}

		};
		obj.sum(10,20);
	}

}
