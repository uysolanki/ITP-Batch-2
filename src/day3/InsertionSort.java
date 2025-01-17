package day3;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 6, 5, 2, 9, 3 };
		System.out.println("Befor Insertion Sort " + Arrays.toString(arr));
		insertionSort(arr);		
		System.out.println("Aftre Insertion Sort " + Arrays.toString(arr));
	}
	private static void insertionSort(int[] arr) {
		int j, k,temp;
		for (k = 1; k < arr.length; k++) {
			temp=arr[k];
			j=k-1;
			
			while(j>=0 && temp<=arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
