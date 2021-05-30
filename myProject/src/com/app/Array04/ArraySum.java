package com.app.Array04;

public class ArraySum {
	static int getSum(int[] inputArray) {
		int sum = 0;
		if(inputArray.length == 0) {
			return -1;
		}
		for(int i = 0; i < inputArray.length;i++) {
			sum = sum + inputArray[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = {3, 3, 2, 4, 3, 6};
		System.out.println(getSum(arr));
	}

}