package com.syntax.groupProject01;

import java.util.Scanner;

public class project01Code01 {

	public static void main(String[] args) {
		
		
		
		// 1.Using Scanner creates an array of integer values. After the array is created, calculate the sum of all stored elements in that array.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please type in 5 numbers below and I will add the sum");

		int[] array = new int[5];
		int total = 0;

		for (int userinput = 0; userinput < array.length; userinput++) {
			array[userinput] = scan.nextInt();
		}

		for (int reassign : array) {
			total += reassign;
		}
		System.out.println("Your total would be " + total);

		
	}

};



// 2. Using Scanner creates an array of countries. When an array is created, retrieve all values from it and while retrieving those values print capital for each country. (use 2 different loops).


