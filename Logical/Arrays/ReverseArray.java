package Arrays;

public class ReverseArray {
	static int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 76, 87, 90 };
	static int a = arr.length - 1;

	static void revArr(int[] arr) {
		System.out.println(arr[a]);
		a--;
		if (a >= 0) {
			revArr(arr);
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		revArr(arr);
		System.out.println((int)System.currentTimeMillis()-start);

	}

}