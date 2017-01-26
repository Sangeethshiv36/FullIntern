package com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

class M {
	void method() throws Exception {
		int arr[] = new int[5];
		throw new FileNotFoundException();

		// throw new IOException;

	}
}

public class Testthrows2 {
	public static void main(String args[]) throws IOException {
		try {
			M m = new M();
			m.method();
		} catch (Exception e) {
			System.out.println(e);
			// e.printStackTrace();
			// System.out.println(e.getMessage());
			// System.out.println("exception handled"+e);
		}

		System.out.println("normal flow...");
	}
}
