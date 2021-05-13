package com.app.ojas2;

public class ListFactor {
 public static String listoffactors(int n) {
	 if(n>0) {
		 String s="";
		 
		 for(int i=1;i<=n;i++) {
			 if(n%i==0) {
				 s=s+" "+i;
				 
			 }
		 }
		 return s;
	 }
	return ""+10/0;
	 
 }
	public static void main(String[] args) {
		 try {
			 int a= Integer.parseInt(args[0]);
			 System.out.println(listoffactors(a));
		 }
	catch(Exception e) {
		System.out.println("Error");
		
	}

}
}
