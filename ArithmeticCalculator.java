package com;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = number; i > 0; i = i / 10) {
			int digit = i % 10;
			sum = sum + digit;
		}
		System.out.println(sum);
	}
}
