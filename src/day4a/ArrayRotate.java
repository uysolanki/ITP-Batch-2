package day4a;

import java.util.Arrays;

public class ArrayRotate {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	double x=(double)arr.length/2;
	int mid=(int) Math.ceil(x);
	System.out.println("Before Rotation "+Arrays.toString(arr));
	rotate(arr,mid);
	System.out.println("After Rotation "+Arrays.toString(arr));
}

private static void rotate(int[] arr, int numberOfRotations) {
	for(int i=1;i<=numberOfRotations;i++)
	{
		int temp=arr[0];
		int j;
		for(j=1;j<arr.length;j++)
		{
			arr[j-1]=arr[j];
		}
		arr[j-1]=temp;
	}
	
}
}
