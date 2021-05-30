package com.app.Array04;

public class OddCounter {
	static int getOddCount(int[] inputArray) {
		int count = 0;
		if(inputArray.length > 10) {
			return -1;
		}
		for(int i = 0;i < inputArray.length;i++) {
			if(inputArray[i] % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		int[] arr= {3, 12, 15, 45, 6, 5, 23, 81, 10, 32};
		System.out.println(getOddCount(arr));
	}

}
