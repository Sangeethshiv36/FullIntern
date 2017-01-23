package com.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryBlock {
	static void mi() {
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 50;
		int number2 = 0;
		int result;
		try {
			FileReader fr = new FileReader("D:\\testout.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {

			System.out.println("arunn");

			result = number1 / number2;
			System.out.println("Result of Division : " + result);
		} catch (ArithmeticException e) {
			System.out.println("Divide by Zero Error");
			System.exit(0);

		} finally {

			System.out.println("asdw");
		}

	}

}
