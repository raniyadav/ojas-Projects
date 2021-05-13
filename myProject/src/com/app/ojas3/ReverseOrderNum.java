package com.app.ojas3;

import java.util.Scanner;

public class ReverseOrderNum {

	public static String getNumbersInRange(int s_val, int e_val) {

		String res = " ";
		if(s_val < 0 || e_val <0)
		{
			res += -1;
		}
		else if(s_val == 0 || e_val == 0) 
		{
			res  += -2;
		}
		else if(s_val>e_val) {
			res +=-3;


		}
		else
		{
			while(s_val <= e_val)
			{
				res += s_val + " ";

				s_val--;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The two Numbers");
		System.out.println(getNumbersInRange(sc.nextInt(), sc.nextInt()));
	}

}


