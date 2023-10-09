package com;

import java.util.Scanner;

public class Details {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = scanner.nextLine();
		System.out.println("Enter housenumber");
		String houseNumber = scanner.nextLine();
		System.out.println("Enter City");
		String city = scanner.nextLine();
		System.out.println("Enter state");
		String state = scanner.nextLine();
		if (state.length() == 2) {
			System.out.println("Enter Pincode");
			String pincode = scanner.nextLine();
			for (int i = 0; i < pincode.length(); i++) {
				char a = pincode.charAt(i);
				if (Character.isDigit(a) && pincode.length() == 6) {
					System.out.println("Your address is:");
					System.out.println(name);
					System.out.println(houseNumber);
					System.out.println(city);
					System.out.println(state + "-" + pincode);

				} else {
					System.out.println("Enter a valid 6 digit pincode");
				}
				break;
			}
		} else {
			System.out.println("Entered state is not found");
		}
	}

}
