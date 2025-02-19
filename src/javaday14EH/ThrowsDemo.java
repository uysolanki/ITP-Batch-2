package javaday14EH;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) {
//		try
//		{
//			double result=divide(10,5);
//			System.out.println(result);	
//		}
//		catch(ArithmeticException e1)
//		{
//			System.out.println(e1.getMessage());
//		}
		try
		{
		double result=divide(10,0);
		System.out.println(result);	
		}
		catch(IOException e1) {}

	}

	private static double divide(int num, int den) throws IOException
	{	
		return num/den;	
	}

}
