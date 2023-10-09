package com;

import java.util.Scanner;

public class Countnumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = scanner.nextInt();
		int count = countDigits(number);
		int sum = sumDigits(number);
		System.out.println("Number of digits:" + count);
		System.out.println("Sum of digits:" + sum);
	}

	private static int countDigits(int number) {
		int count = 0;
		while (number != 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	private static int sumDigits(int number) {
		int sum = 0;
		while (number != 0) {						
			int number1 = number % 10;
			sum = sum + number1;
			number = number / 10;
		}
		return sum;
	}

 }

//java program to count the numer of digits in a number and their sum
