package com;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[4];
		System.out.println("Enter the array elements");
		for (int i = 0; i < 4; i++) {
			int element = scanner.nextInt();
			array[i] = element;
		}
		int i = 0;
		while (i < array.length) {
			int number1 = array[i];
			int number2 = array[array.length - (i + 1)];
			if (number1 == number2) {
				if (i == array.length - 1) {
					System.out.println("Given number is a palindrome ");
					break;
				}
				i++;
			} else {
				System.out.println("Given number is not a palindrome ");
				break;
			}
		}

	}
}
