package com.app.ojas2;

public class Factorial {
	public static void main(String[] args) {
		
	
		int i,fact=1;
		try {
			 int n=Integer.parseInt(args[0]);

			if(n>0) {
				for(i=1;i<=n;i++) {
					fact=fact*i;
				}
				System.out.println("Factor of Number"+fact);
			}

		}catch(Exception e){
			System.out.println("Error");
		}

	}
}
