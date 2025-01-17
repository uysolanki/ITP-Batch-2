package day5;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int arr[]= {8,3,7,5,6,2,9,1};
		System.out.println("Before MergeSort "+Arrays.toString(arr));
		split(arr,0,arr.length-1);
		System.out.println("After MergeSort "+Arrays.toString(arr));

	}

	private static void split(int[] arr, int first, int last) {  //first    last     mid
																 // 0       7        3
		if(first<last)
		{
		int mid=(first+last)/2;
		split(arr,first,mid);
		split(arr,mid+1,last);
		merge(arr,first,mid,last);
		}
	
	}

	private static void merge(int[] arr, int first, int mid, int last) {
		int brr[]=new int[last+1];
		
		int i=first;
		int j=mid+1;
		int k=first;
		
		while(i<=mid && j<=last)
		{
			if(arr[i]<=arr[j])
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
			else
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(i>mid)
		{
			while(j<=last)
			{
				brr[k]=arr[j];
				j++;
				k++;
			}
		}
		
		if(j>last)
		{
			while(i<=mid)
			{
				brr[k]=arr[i];
				i++;
				k++;
			}
		}
		
		for(int z=first;z<=last;z++)
			arr[z]=brr[z];
	}

}
