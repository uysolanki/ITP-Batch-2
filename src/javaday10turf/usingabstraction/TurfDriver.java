package javaday10turf.usingabstraction;

import java.util.Scanner;

public class TurfDriver {

	public static void main(String[] args) {
		Booking booking =new Booking();
		booking.acceptBooking();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Choose Turf ");
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Tennis");
		System.out.println("0. Exit");
		int turfChoice=sc.nextInt();
		
		Turf turf=null;
		switch(turfChoice)
		{
		case 1:  turf=new CricketTurf();break;
		case 2:  turf=new FootballTurf();break;
		case 3:  turf=new TennisTurf();break;
		case 0 : System.exit(0);
		default : System.out.println("Invalid Choice");
		}
	
		booking.displayBooking(turf);
	}

}
