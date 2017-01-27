package Arrays;

import java.util.Scanner;

//import java.util.Arrays;

public class ReverseString {

	private static Scanner userInput;

	public static void main(String[] args) {
		System.out.print("Enter any String :");
		userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		byte[] bytesArray = input.getBytes();
		byte[] bytesToString = new byte[bytesArray.length];

		// System.out.println(Arrays.toString(bytesArray));--testing
		// char ch=101;
		// System.out.println(ch);

		for (int i = 0; i < bytesArray.length; i++) {
			bytesToString[i] = bytesArray[i];
		}

		// System.out.println(new String(bytesToString));

		// Converting bytesArray to CharArray

		char[] charArray = new char[bytesToString.length];

		System.out.println("\nCharacter Array Reverse:\n");
		for (int j = 0; j < bytesToString.length; j++) {
			charArray[j] = (char) bytesToString[bytesToString.length - j - 1];
		}

		// String using byte[] array
		System.out.println(new String(charArray));
	}

}
