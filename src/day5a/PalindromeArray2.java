package day5a;

import java.util.Arrays;

public class PalindromeArray2 {

	public static void main(String[] args) {
	//                       i 
		           //0  1  2 3  4  5  6  7  8
		int arr[]= {10,20,30,77,98,77,30,20,10};
		int i,k;
		for(i=arr.length-1,k=0;i>=arr.length/2;i--,k++)  //99->10  89
			if(arr[k]!=arr[i])
			{
				break;
			}
		System.out.println(i==arr.length/2-1?"Palindrome Array":"Not  Palindrome Array");
	}

}
