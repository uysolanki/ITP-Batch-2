package javaday13EH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SampleEHProgram {

	public static void main(String[] args) {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double result=10/0;
		test();
		//System.out.println(result);					    //true
	}

	private static void test() {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");			//10
		int numerator=sc.nextInt();
		System.out.println("Enter Denominator");		//5
		int denominator=sc.nextInt();
		
		double result=numerator/denominator;
		
		System.out.println("Result is "+result);		//Result is 2.0	
		String name=null;
		System.out.println(name.length());
		
		}
		
		catch(ArithmeticException | InputMismatchException | NullPointerException e1){
			System.out.println(e1.getMessage());	
		}
		
		catch(Exception e2) {
			
		}
		
	}
}
