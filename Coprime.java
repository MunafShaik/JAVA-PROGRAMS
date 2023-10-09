package com;

import java.util.Scanner;

public class Coprime {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number");
		int number2 = scanner.nextInt();
		int z = 0;
		for (int i = 1; i <= number1; i++) {
			if (number1 % i == 0 & number2 % i == 0) {
				z = i;
			}
		}
		System.out.println(z);

		if (z <= 1) {
			System.out.println("Given numbers are co-prime");
		} else {
			System.out.println("Given numbers are not co-prime");
		}
	}
}
