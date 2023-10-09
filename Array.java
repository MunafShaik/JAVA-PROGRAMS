package com;

import java.util.Scanner;

public class Array {
	public int findMyIndex(String[] array, String target) {
		if (array.length == 0) {
			System.out.println("no elements found in the array");
		} else {
			for (int i = 0; i < array.length; i++) {
				String element = array[i];
				if (element.equals(target)) {
					return i;
				}
			}
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String array[] = new String[5];
		System.out.println("Enter the array elements");
		for (int i = 0; i < 5; i++) {
			String element = scanner.next();
			array[i] = element;
		}
		System.out.println("Enter target value");
		String target = scanner.next();
		Array a = new Array();

		int index = a.findMyIndex(array, target);
		if (index != 0) {
			System.out.println("The index of given number is :" + index);
		} else {
			System.out.println("Given target value is not found in the array");
		}
	}
}