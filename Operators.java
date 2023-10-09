package com;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter second number");
		int number2 = scanner.nextInt();
		System.out.println("Enter the operator you want to search:");
		String ch = scanner.next();
		switch (ch) {
		case "+":
			int result = number1 + number2;
			System.out.println("The result is:" + result);
			break;
		case "-":
			result = number1 - number2;
			System.out.println("The result is:" + result);
			break;
		case "*":
			result = number1 * number2;
			System.out.println("The result is:" + result);
			break;
		case "/":
			if (number2 == 0) {
				System.out.println("It is undefined");
				break;
			}
			result = number1 / number2;
			if (number1 < number2) {
				System.out.println("Number2 is greater than number1");
			} else if (number1 > number2) {
				System.out.println("Number1 is greater than number2:" + result);
			} else {
				System.out.println("Both are equal");

			}
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
