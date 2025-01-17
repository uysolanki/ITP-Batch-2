package day3;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int arr[] = { 6, 5, 2, 9, 3 };
		System.out.println("Befor Bubble Sort " + Arrays.toString(arr));
		bubbleSort(arr,arr.length);
		System.out.println("Aftre Bubble Sort " + Arrays.toString(arr));
	}

	private static void bubbleSort(int[] brr, int size) {
		int i, j, temp;

		for (i = 1; i <= size; i++) {
			for (j = 0; j < size - i; j++) {
				if (brr[j] > brr[j + 1]) {
					temp = brr[j];
					brr[j] = brr[j + 1];
					brr[j + 1] = temp;
				}
			}
		}
	}

}
