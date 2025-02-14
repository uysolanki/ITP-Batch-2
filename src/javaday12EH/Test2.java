package javaday12EH;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter Numerator");
				int n=sc.nextInt();
				System.out.println("Enter Denominator");
				int d=sc.nextInt();
				try
				{
				int result=n/d;
				System.out.println(result);
				}
				catch(ArithmeticException e) 
				{
					System.out.println("Deno cannot be zero");
				}
				
				System.out.println("Welcome");

	}

}
