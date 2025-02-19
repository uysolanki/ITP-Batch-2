package javaday14EH;

import java.util.Scanner;

public class Wholesaler {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Quantity ");
		int qty=sc.nextInt();
		try
		{
		if(qty>500)
			System.out.println("Order Accepted");
		else
			throw new LowQuantityException("Please enter quantity > 500");
			//throw new ArithmeticException("Please enter quantity > 500");
		}
		catch(LowQuantityException e1)
		{
			System.out.println(e1.getMessage());
		}
		catch(ArithmeticException e2)
		{
			System.out.println(e2.getMessage());
		}
		
		finally {
			System.out.println("Thank You!!, Visit Again");
		}
	}

}
