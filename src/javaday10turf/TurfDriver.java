package javaday10turf;

import java.util.Scanner;

public class TurfDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name");
		String customerName=sc.next();
		
		System.out.println("Enter Date");
		String eventDate=sc.next();
		
		System.out.println("Enter Time");
		String eventTime=sc.next();
		
		System.out.println("Enter Number of Hours");
		int hours=sc.nextInt();
		
		System.out.println("Choose Turf ");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.println("0. Exit");
	
		int turfChoice=sc.nextInt();
		
		switch(turfChoice)
		{
		case 1: System.out.println("**** BILL *****");
		        System.out.println("Customer Name "+customerName);
		        System.out.println("Court Type "+ "Cricket Court");
		        System.out.println("Date "+eventDate);
		        System.out.println("Time "+eventTime);
		        System.out.println("Hours "+hours);
		        System.out.println("Total Payable "+ (700*hours));
		        break;
		        
		case 2: System.out.println("**** BILL *****");
		        System.out.println("Customer Name "+customerName);
		        System.out.println("Court Type "+ "Football Court");
		        System.out.println("Date "+eventDate);
		        System.out.println("Time "+eventTime);
		        System.out.println("Hours "+hours);
		        System.out.println("Total Payable "+ (1000*hours));
		        break;
		        
		case 3: System.out.println("**** BILL *****");
		        System.out.println("Customer Name "+customerName);
		        System.out.println("Court Type "+ "Tennis Court");
		        System.out.println("Date "+eventDate);
		        System.out.println("Time "+eventTime);
		        System.out.println("Hours "+hours);
		        System.out.println("Total Payable "+ (1500*hours));
		        break;
		case 0 : System.exit(0);
		        
		default : System.out.println("Invalid Choice");
		}
		

	}

}
