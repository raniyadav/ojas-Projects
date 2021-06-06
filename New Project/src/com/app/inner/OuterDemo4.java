package com.app.inner;
  
interface ArthOperation{
	void sum(int a, int b);
	default void disp(){
		System.out.println("welcome");
		
	}
	static void disp1(){
		System.out.println("hai..");
	}
}
public class OuterDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithoperation obj=new Arithoperation() {
			
			public void sum(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println(a+b);
			}
		};
		obj.sum(10, 20);
		obj.disp();
		Arithoperation.disp1();
	}

}
