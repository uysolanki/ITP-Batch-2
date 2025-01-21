package day3;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 2, 9, 3 };
		System.out.println("Befor Selection Sort " + Arrays.toString(arr));
		selectionSort(arr);		
		System.out.println("Aftre Selection Sort " + Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int i, j, temp;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

}
