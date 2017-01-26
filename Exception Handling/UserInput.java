package com.exception;

import java.util.Scanner;

public class UserInput {
	static boolean isNan(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException e) {
			System.out.println("Enter a valid Number");
			return false;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String number = sc.next();

		if (UserInput.isNan(number)) {
			System.out.println("Entered Number is " + number);
		} else {
			System.out.println("Try Again");
			while (sc.hasNextLine()) {
				UserInput.isNan(sc.next());
				if (sc.hasNextInt()) {
					break;
				}
			}
		}
	}

}
