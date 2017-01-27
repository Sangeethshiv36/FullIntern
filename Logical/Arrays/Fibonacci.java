package Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 0, firstNum = 0, squareNum = 1, nextNum = 0;
		long start = System.nanoTime();
		System.out.println(start / 1000);
		System.out.println(firstNum + "\n" + squareNum);
		while (squareNum < 1000000) {// 872 time (clean and built)
			sum = firstNum + (squareNum * squareNum);
			System.out.println(sum);
			nextNum = firstNum + squareNum;
			firstNum = squareNum;
			squareNum = nextNum;

			// for(;squareNum < 1000000;) {//1058 time (clean and built)
			// sum = firstNum + (squareNum * squareNum);
			// System.out.println(sum);
			// nextNum = firstNum + squareNum;
			// firstNum = squareNum;
			// squareNum = nextNum;
			// }

		}
		System.out.println((System.nanoTime() - start) / 1000);
	}
}
