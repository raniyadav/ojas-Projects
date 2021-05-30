package com.app.Array04;


public class OccurenceCounter {
	
	static int getCount(int[] inputArray, int givenNumber) {
		int count = 0;
		for(int i = 0; i<inputArray.length; i++) {
			if(inputArray[i] == givenNumber) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 4, 4, 2, 4, 3, 2, 2, 2, 2};
		 int num = 4;
		 System.out.println(getCount(arr, num));
	}

}
