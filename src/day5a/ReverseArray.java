package day5a;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		          //0  1  2
		int arr[]= {10,20,30};
		int brr[]=new int[arr.length];
		
		System.out.println(Arrays.toString(arr));

		for(int i=arr.length-1,k=0;i>=0;i--,k++)
			brr[k]=arr[i];
		
		System.out.println(Arrays.toString(brr));	
	}

}
