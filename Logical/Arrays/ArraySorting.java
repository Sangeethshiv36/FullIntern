package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the capacity of array :");
		int[] myIntegers = getIntegers(input.nextInt());
		// printArray(myIntegers);
		int[] sortedArray = sortIntegers(myIntegers);
		printArray(sortedArray);
	}

	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		System.out.println("Enter " + capacity + " Integer values :\r");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " Contents " + array[i]);
		}
	}

	public static int[] sortIntegers(int[] array) {
		// inbuilt method -- To copy array
		int[] sortedArray = Arrays.copyOf(array, array.length);

		// new int[array.length];
		// for (int i = 0; i < array.length; i++) {
		// sortedArray[i] = array[i];
		// }

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) { //Descending(<),Ascending(>)
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;
	}

}
