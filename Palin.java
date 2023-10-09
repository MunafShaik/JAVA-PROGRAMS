package com;

import java.util.Scanner;

public class Palin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		if (ispalin(number)) {
			System.out.println("Given number is a palindrome ");
		} else {
			System.out.println("Given number not a palindrome ");
		}
	}

	public static boolean ispalin(int number) {
		int originalNumber = number;
		int reversedNumber = 0;
		while (number != 0) {
			int remainder = number % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			number = number / 10;
		}
		return originalNumber == reversedNumber;

	}
}
