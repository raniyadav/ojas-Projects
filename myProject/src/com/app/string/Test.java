package com.app.string;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "welcome";
		System.out.println("Before"+str.hashCode());
		str+="welcome";
		System.out.println(""+str.hashCode());
		StringBuffer sb =new StringBuffer();
		sb.append("welcome");
		System.out.println("After"+sb+" "+sb.hashCode());
	}

}
