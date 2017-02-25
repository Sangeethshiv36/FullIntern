package Arrays;

public class DigitSortWhile {

	public static void main(String[] args) {
		int a[] = { 4444, 5672, 8726, 8362, 1155, 1288, 9766, 1000, 9011, 7655, -1178, 9283, 2362, 2716, 8902, -4673,
				1638, 1743, -1835, 2679, 4728, 6082, 8926, -6473, -7648, 7584, 3421, 4839, 9391, 9482, 2939, 4692,
				-7318, 2828, 5667 };
		int k = 0, j, l = 0;

		while (k < a.length) {
			j = 0;
			while (j < a.length) {
				if (a[k] < a[j]) {
					a[k] = a[k] + a[j];
					a[j] = a[k] - a[j];
					a[k] = a[k] - a[j];
				}
				j++;
			}
			k++;
		}

		k = 0;
		while (k < a.length) {
			if (k < l) {
				j = 0;
				while (j < l) {
					if ((a[k] / 100) % 10 < (a[j] / 100) % 10) {
						a[k] = a[k] + a[j];
						a[j] = a[k] - a[j];
						a[k] = a[k] - a[j];
					}
					j++;
				}
			} else {
				j = l;
				while (j < a.length) {
					if ((a[k] / 100) % 10 < (a[j] / 100) % 10) {
						a[k] = a[k] + a[j];
						a[j] = a[k] - a[j];
						a[k] = a[k] - a[j];
					}
					j++;
				}
			}
			k++;
		}
		System.out.println("result:");
		for (int i = a.length - 1; i > -1; i--) {
			System.out.print(" " + a[i]);
		}

	}

}