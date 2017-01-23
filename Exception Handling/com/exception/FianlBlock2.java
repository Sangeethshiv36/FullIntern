package com.exception;

public class FianlBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int aa = 10 / 0;
			try {
				String a = null;
				System.out.println(a.length());
			} finally {
				System.out.println("This is a 1st inner final");

			}
		} catch (Exception e) {
			System.out.println("Outer Error Handled");
		} finally {
			System.out.println("this is outrer try finnal");
		}
	}

}
