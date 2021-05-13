package com.app.ojas4;

public class Sign {
	static int findSign(int num) {
		if(num>0) {
			return 1;
		}


		else if(num<0) {

			return -1;
		}

		else
		{
			if(num==0) {
			}
			return 0;
		}


	}


	public static void  main(String args[]) {
		int n1 = Integer.parseInt(args[0]);
		int rani = findSign(n1);
		System.out.println(rani);


	}


}
