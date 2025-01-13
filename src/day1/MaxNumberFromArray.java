package day1;

import java.util.Scanner;

public class MaxNumberFromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of the array");
		int size=sc.nextInt();//5
		
		int arr[]=new int[size];
													//0			1		2		3		4
		for(int i=0;i<size;i++)						//145		515		479		277		153
		{
			System.out.println("Enter a Number");
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];							//max		i			arr[i]
												//5			1			15      is 15>5 True
		for(int i=1;i<size;i++)					//15		2			9       is 9>15 False
		{										//15		3           27      is 27>15 True
			if(arr[i]>max)						//27        4           13      is 13>27 False
			{									//			5				
				max=arr[i];
			}
		}
		
		System.out.println("Maximum Number " + max);

	}

}
