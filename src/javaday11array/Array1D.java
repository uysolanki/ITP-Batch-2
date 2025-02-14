package javaday11array;

import java.util.Arrays;

public class Array1D {

	public static void main(String[] args) {
		int arr[] = new int[5]; // array declaration

		int arr1[] = {};

		System.out.println(Arrays.toString(arr1));

		if (arr1.length > 0) {

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr1[i]);
			}
			System.out.println("--------");
			// for each loop
			for (int n : arr1) {
				System.out.println(n);
			}
		} else {
			System.out.println("Pls enter valid array");
		}
	}

}
