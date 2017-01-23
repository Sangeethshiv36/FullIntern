package com.exception;

public class ExceptionPropagation {
	void m() {
		int data = 50 / 0;
		ArithmeticException ob = new ArithmeticException();
		// FileNotFoundException obb=new ArithmeticException();
		throw ob;
	}

	void n() {
		m();
	}

	void p() {
		try {
			n();
		} catch (Exception e) {
			System.out.println("exception handled" + e);
		}
	}

	public static void main(String args[]) {
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.p();
		System.out.println("normal flow...");
	}
}
