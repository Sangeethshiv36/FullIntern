package com.exception;

public class FinallyBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		int arr[] = new int[5];
		try {
			try {
				arr[3] = 5;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Err: Array Out of Bound");
				throw e;

			} finally {
				System.out.println("this is a Inner 1st final");
			}
			System.out.println("rest of the code...");

			try {
				result = num1 / num2;
			} catch (ArithmeticException e) {
				System.out.println("Err: Divided by Zero");
			} finally {
				System.out.println("this is a Inner 2nd  final");
			}
			System.out.println("Result of Division : " + result);
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");

	}

}
