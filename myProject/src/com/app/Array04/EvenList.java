package com.app.Array04;

public class EvenList {
	static int x = 0;
	static int[] getEvenArray(int[] inputArray) {
		
		int[] newArray = new int[inputArray.length];
		
		if(inputArray.length > 10) {
			return null;
		}
		for(int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] % 2 == 0) {
				newArray [x] = inputArray[i];
				x++;
			}
		}
		return newArray;
	}
	public static void main(String[] args) {
		int[] number = {9,3,5, 15, 3, 6, 8, 9, 10, 11};
		int[] evenNumbers = getEvenArray(number);
		if(evenNumbers == null)
			System.out.println(evenNumbers);
		else {
			for(int i = 0; i < x; i++) {
				System.out.print(evenNumbers[i] + " ");
			}
		}
	}

}
