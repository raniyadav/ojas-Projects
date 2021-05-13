package com.app.ojas.pattern;

public class Pattern9 {

	public static void main(String[] args) {
		char j = 'A';
		for(int i = 1; i <=5;i++) {
			int x = 1;
			for(; x<=i;j++) {
				System.out.print(j+" ");
				x++;
			}
			System.out.println();
		}
	}

}

