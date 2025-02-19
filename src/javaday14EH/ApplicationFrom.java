package javaday14EH;

import java.util.Scanner;

public class ApplicationFrom {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.nextLine();
		int i=0;
		try
		{
		for(i=0;i<firstName.length();i++)
		{
			
			if(firstName.charAt(i)==' ')
			{
				throw new InvalidNameException("First Name cannot have a Space");	
			}	
		}
		}
		catch(InvalidNameException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		if(i==firstName.length())
				System.out.println("Form Submitted");
			

	}

}
