package com.exception;

public class NestedTryCatch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		int arr[] = new int[5];

		try {
			try {
				// arr[5] = 5;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Err: Array Out of Bound");
			}
			try {
				result = num1 / num2;
			} catch (ArithmeticException e) {
				System.out.println("Err: Divided by Zero");
			}
			System.out.println("Result of Division : " + result);
		} catch (Exception e) {
			System.out.println("Exception Occured !");
		}

	}

}
