package com.syntax.groupProject01;

public class project01Code10 {

	public static void main(String[] args) {
		
		int[] num = { 34, 7, 24, 9, 16 };

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest) {
				largest = num[i];
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
			}
		}
		System.out.println("The second largest number is "+secondLargest);

	}

		

	}
