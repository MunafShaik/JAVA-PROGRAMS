package com;

import java.util.Scanner;

public class Average1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int sum = 0;
		int count = 0;
		for (int i = number; i > 0; i = i / 10) {
			int digit = i % 10;
			sum = sum + digit;
			count++;
		}

		System.out.println("The sum is:" + sum);
		System.out.println("The count is:" + count);
		int average = (sum / count);
		System.out.println("The average is:" + average);

	}
}