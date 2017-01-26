package com.exception;

public class NestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b;
		int aa[] = new int[5];
		try {
			String s = null;
			System.out.println(s.length());
			try {
				b = 25 / a;
			} catch (ArithmeticException d) {
				System.out.println(d);
			}
			try {
				System.out.println(aa[5]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		} catch (NullPointerException r) {
			System.out.println("Null Exception");
		} catch (Exception r) {
			System.out.println(r);
		}
	}

}
