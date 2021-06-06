package com.app.inner;

public class OuterDemo2 {
	void dip(){
		System.out.println(" welcome");

		class InnerDemo{
			void wish(){
				System.out.println("hai...");
			}

		}
		InnerDemo obj=new InnerDemo();
		obj.wish();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterDemo2 outeobj= new OuterDemo2();
		outeobj.dip();
	}

}
