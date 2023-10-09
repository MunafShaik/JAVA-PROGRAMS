package com;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int firstterm = 0, secondterm = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n1 = scanner.nextInt();
		System.out.println("The fibonacci series is");
		for (int i = 1; i <= n1 - 2; i++) {
			int nextnumber = firstterm + secondterm;
			System.out.println(nextnumber);
			firstterm = secondterm;
			secondterm = nextnumber;
		}

	}

}
