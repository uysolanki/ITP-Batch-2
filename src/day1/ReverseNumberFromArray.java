package day1;

import java.util.Arrays;

public class ReverseNumberFromArray {

	public static void main(String[] args) {
		int arr[]= {145,515,479,277,153};
		
		System.out.println("Before " +Arrays.toString(arr));
		
		
		for(int i=0;i<arr.length;i++)
		{
			int n=arr[i];
			int rev=0;
			while(n>0)
			{
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			}
			arr[i]=rev;
		}
		
		System.out.println("After " +Arrays.toString(arr));
	}

}
