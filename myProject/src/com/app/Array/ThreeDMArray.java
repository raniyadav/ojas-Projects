package com.app.Array;

import java.util.Scanner;

public class ThreeDMArray {

	public static void main(String[] args) {
		int Student[][]= new int[3][0];
		Student[0]= new int[3];
		Student[1]= new int[2];
		Student[2]= new int[1];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 3 Stud marks ");
		for(int i=0;i<Student.length;i++){   
			System.out.println("Enter"+(i+1)+"studs"+Student[i].length+"sub marks");
			for(int j=0;j<Student.length;j++){
				Student[i][j]=sc.nextInt();
			}
		}
		System.out.println("Student info");
		for(int i=0;i<Student.length;i++){
			for(int j=0;j<Student.length;j++){
				System.out.print(Student[i][j]+"");
			}
			System.out.println();
		}
	}
}