package com.app.ojas2;

public class Adder {

private static String getsum(int n1, int n2) {
	 
	return ""+(n1+n2);
	
}
	
	public static void main(String[] args) {
 try {
	 int n1=Integer.parseInt(args[0]);
	 int n2=Integer.parseInt(args[1]);
	if((n1<0 )|| (n2<0))
		System.out.println("error");
	else 
		{
		System.out.println(getsum(n1, n2));
		}
	}catch(Exception e) {
		
		System.out.println("error");

}
}
	}