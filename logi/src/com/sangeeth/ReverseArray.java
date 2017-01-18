package com.sangeeth;

class A { 

	int[] arr = { 1, 2, 3, 4, 5 };
	int a = arr.length-1;

	void revArr(int[] arr) {
		System.out.println(arr[a]);
		a--;
		revArr(arr);
	}
}

public class ReverseArray { 
	public static void main(String[] args){
		A a=new A();
		a.revArr(a.arr);
	}

}
