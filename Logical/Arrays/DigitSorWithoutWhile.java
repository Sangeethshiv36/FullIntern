package Arrays;

public class DigitSorWithoutWhile {
	static int swap(int i, int j, int a[]) {
		if (j < a.length) {
			if ((a[i] / 100) % 10 > (a[j] / 100) % 10) {
				a[i] = a[i] + a[j];
				a[j] = a[i] - a[j];
				a[i] = a[i] - a[j];
			}
			return swap(i, ++j, a);
		} else
			return fun(a, ++i);

	}

	static int fun(int a[], int i) {
		if (i < a.length) {
			swap(i, 0, a);
			if (i == a.length - 1)
				for (i = 0; i < a.length; i++)
					System.out.print(a[i] + " ");
		}
		return 0;
	}

	public static void main(String[] args) {
		int a[] = { 4444, 5672, 8726, 8362, 1155, 1288, 9766, 1000, 9011, 7655, -1178, 9283, 2362, 2716, 8902, -4673,
				1638, 1743, -1835, 2679, 4728, 6082, 8926, -6473, -7648, 7584, 3421, 4839, 9391, 9482, 2939, 4692,
				-7318, 2828, 5667 };
		fun(a, 0);
	}

}
