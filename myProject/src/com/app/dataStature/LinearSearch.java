package com.app.dataStature;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int i,n,search;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter number of elements");
	n=sc.nextInt();
	int[] array=new int[n];
	System.out.println("Enter thoose" +n+"elements");
 for(i=0;i<n;i++){
	 array[i]=sc.nextInt();
	 System.out.println(" enter value to find ");
	 search=sc.nextInt();
	 for(i=0;i<n;i++){
		 if(array[i]==search){
			 System.out.println(search+"is present at location "+search);
			 
		 }
		 
	 }
	 
 }
	}

}
