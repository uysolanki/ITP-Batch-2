package javaday12EH;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Numerator");
		try
		{
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter Denominator");
		int d=Integer.parseInt(br.readLine());
		int result=n/d;
		System.out.println(result);
		}
		catch(IOException e) {
			System.out.println("Invalid Details");
		}
		catch(ArithmeticException e) {
			System.out.println("Invalid Deno");
		}
		System.out.println("Welcome");
		
	}
}
