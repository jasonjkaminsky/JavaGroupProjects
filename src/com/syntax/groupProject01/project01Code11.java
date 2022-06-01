package com.syntax.groupProject01;

public class project01Code11 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9, 5, 7, 1 };
		int i;
		int j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
