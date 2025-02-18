package javaday14EH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		
		int arr[]=new int[2];
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value for Index 0");   //10
		arr[0]=sc.nextInt();
		
		System.out.println("Enter Value for Index 1");   //0
		arr[1]=sc.nextInt();
		
		
					try
					{
					System.out.println("enter index of numerator number");
					int nIndex=sc.nextInt();   //7
					int numerator=arr[nIndex]; //numerator=10

					System.out.println("enter index of denominator number");
					int dIndex=sc.nextInt();   //1
					int denominator=arr[dIndex]; //	denominator=0
					
					double result= numerator/denominator;
					System.out.println(result);
					}
					catch(ArithmeticException e1)
					{
						System.out.println("Cannot "+ e1.getMessage());
					}
					catch(ArrayIndexOutOfBoundsException e2)
					{
						System.out.println("Please enter valid index");
					}

		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter valid Integer Value");
		}
	}

}
