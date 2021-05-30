package com.app.oops;

import java.awt.Rectangle;

public class Retrangle {
	double length, breath;

	double getArea(double length) {
		return length;


	}
	double getparemeter(){
		return breath;

	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	
	@Override
	public String toString() {
		return "Retrangle [length=" + length + ", breath=" + breath
				+ ", getparemeter()=" + getparemeter() + ", getLength()="
				+ getLength() + ", getBreath()=" + getBreath()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	public static void main(String[] args) {
		Rectangle rt= new  Rectangle();
		
	}

}
