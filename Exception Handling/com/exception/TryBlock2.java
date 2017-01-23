package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryBlock2 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("B:/myfile.txt");
		} catch (Exception fnfe) {
			System.out.println(fnfe);
		}

	}
}
