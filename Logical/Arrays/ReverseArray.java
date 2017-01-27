package Arrays;

public class ReverseArray {
	static int[] arr = { 56, 78, 90, 76, 44, 22, 78, 99, 11 };
	static int a = arr.length - 1;

	static void revArr(int[] arr) {
		System.out.println(arr[a--]);
		if (a >= 0) {
			revArr(arr);
		}
	}

	public static void main(String[] args) {
		//long start = (int)System.currentTimeMillis(); //For Benchmarking purpose
		revArr(arr);
		//System.out.println((int)System.currentTimeMillis() - start);// ^

	}

}
