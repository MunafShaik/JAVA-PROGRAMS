package com;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstnumber = scanner.nextInt();
		System.out.println("Enter second number");
		int secondnumber = scanner.nextInt();
		System.out.println("Before Swapping");
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		firstnumber = firstnumber + secondnumber;
		secondnumber = firstnumber - secondnumber;
		firstnumber = firstnumber - secondnumber;
		System.out.println("After Swapping");
		System.out.println(firstnumber);
		System.out.println(secondnumber);
	}
}