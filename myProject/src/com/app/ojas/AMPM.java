package com.app.ojas;

public class AMPM {

	public static void main(String args[]) {
		String a= args[0];
		String a1=args[1];
		if(a.equalsIgnoreCase("AM")) {
			System.out.println("Good marning "+a1);
		}

		else if(a.equalsIgnoreCase("PM")) {
			System.out.println("good evening  "+a1);

		}
		else
			System.out.println("First argument should be either AM or PM ");
	}
}

