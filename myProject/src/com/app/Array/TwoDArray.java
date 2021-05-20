package com.app.Array;
import java.util.Scanner;
public class TwoDArray {
	static int isElementExist(int n1 ,int searchValue){
		boolean flag = false;
		int [][] A = new int [2][3];
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 3 ; j++){
				if(searchValue == A[i][j]){
					flag=true;
				
				}else if (flag) {
				    flag = false;
				} else {
				    flag = true;
				}
				}
		}
		return searchValue;
		
	
	}		//else if(searchValue=null){

				//	flag=flase;
				//}else{
				//	flag=flase;
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter  the  elemnet");
					int rani =isElementExist(sc.nextInt(), sc.nextInt());
					System.out.println(rani);
				}
			}
