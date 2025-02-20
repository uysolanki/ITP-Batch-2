package javaday14EH;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException
	{
//		try
//		{
//			double result=divide(10,5);
//			System.out.println(result);	
//		}
//		catch(ArithmeticException e1)
//		{
//			System.out.println(e1.getMessage());
//		}
		
		//Part 1
//		try
//		{
//		double result=divide(10,0);
//		System.out.println(result);	
//		}
//		catch(IOException e1) {}
		
		
		double result=divide(10,0);
		System.out.println(result);	

	}

	private static double divide(int num, int den) throws IOException
	{	
		return num/den;	
	}

}
