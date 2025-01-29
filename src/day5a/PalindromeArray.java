package day5a;

import java.util.Arrays;

public class PalindromeArray {

	public static void main(String[] args) {
	//                       i
		           //0  1  2 3  
		int arr[]= {10,20,20,10};
		int flag=0;
		for(int i=arr.length-1,k=0;i>=arr.length/2;i--,k++)  //99->50  half
			if(arr[k]!=arr[i])
			{
				flag=1;
				break;
			}
		
//		if(flag==1)
//		System.out.println("Not Palindrome");
//		else
//			System.out.println("Palindrome");	
		
			System.out.println(flag==1?"Not Palindrome Array":"Palindrome Array");	
	}

}
