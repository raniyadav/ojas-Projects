package com.app.ojas2;

public class SumFactor {
	public static int sumofFactor(int n) {
		if(n>0) {
			int  x=0;

			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					x=x+i;

				}
			}
			return x;
		}
		return n;
	}

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			System.out.println(sumofFactor(a));	
		}catch(Exception e){
			System.out.println("Error");
		}
	}

}
