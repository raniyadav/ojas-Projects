package com.app.aa;

public class StaticDemo {
static int num;
int num1;
	public static void main(String[] args) {
System.out.println(num);
System.out.println(StaticDemo.num);


StaticDemo st=new StaticDemo();//
System.out.println(st.num);

System.out.println(st.num1);// with object 

	}

}
