package com.app.oops;

import java.util.Scanner;

public class Student {
	int Sno;
	String name;
	int marks[] = new int[5];

	void accept(int Sno, String name, int[] marks) {
		this.Sno = Sno;
		this.name = name;
		this.marks = marks;
	}
	int totalMarks() {
		int sum = 0;
		for(int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		return sum;
	}
	void disStudent() {
		System.out.println("Sno = " + Sno);
		System.out.println("Name =" + name);
		System.out.println(findGrade());
	}
	boolean isPass() {
		boolean b = false;
		int count = 0;
		for(int i = 0; i < marks.length; i++) {
			if(marks[i] >= 35) {
				count++;
			}
		}
		if(count == marks.length) {
			b = true;
		}
		return b;

	}
	String findGrade() {
		String res = " ";
		if(isPass()) {
			res += "you passed \n";
			int tot = totalMarks();
			res += "totalMarks =" +tot+ "\n";
			int avg = tot / marks.length;
			res += "avgMarks =" +avg+ "\n";
			if(avg >= 75) {
				res += "your got distinction \n";
			}
			else if (avg >= 60) {
				res += "you got first class \n";

			}
			else if (avg >= 50) {
				res += "you got second class \n";
			}
			else if (avg >= 40) {
				res += "you got third class \n";
			}
			else {
				res = "try Again";
			}

		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your no, name, 5subMarks ?");
		Student obj = new Student ();
		int Sno = sc.nextInt();
		String name = sc.next();
		int  marks[] = new int[5];

		for(int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();

		}
		obj.accept(Sno, name,marks);
		obj.disStudent();
		Student s = new Student();
	}



}

