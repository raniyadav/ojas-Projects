package com.app.inner;


class Food{
	void eat(){
		System.err.println("Eat hyginic food ");
	}
}
public class PopCorn {
	Food f= new Food(){
		void eat(){
			super.eat();
			System.out.println("PopCorn is a junk food ");
		}
	};
	void disp(){
		f.eat();
	}
	public static void main(String[] args) {
		PopCorn obj=new PopCorn();
		obj.disp();

	}

}
