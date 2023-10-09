package com;

import java.util.Scanner;

public class Greater {
	public static int sum(int number1) {
		int sum = 0;
		for (int i = number1; i > 0; i = i / 10) {
			int digit = i % 10;
			sum = sum + digit;

		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number");
		int number2 = scanner.nextInt();
		int sum1 = sum(number1);
		int sum2 = sum(number2);
		System.out.println("The sum of digits of first number is:" + sum1);

		System.out.println("The sum of digits of second number is:" + sum2);
		int difference = Math.abs(sum1 - sum2);
		if (sum1 > sum2) {
			System.out.println(" Sum of digits of first number is greater than sum of digits of second number ");
		} else if (sum2 > sum1) {
			System.out.println("Sum of digits of second number is greater than sum of digits of first number");
		} else {
			System.out.println("Both are equal");
		}
		System.out.println("The difference is:" + difference);
		if (difference % 2 == 0) {
			System.out.println("The difference of two numbers is even");
		} else {
			System.out.println("The difference of two numbers is odd");
		}
	}

}
