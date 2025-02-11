package javaday10turf.usingabstraction;

import java.util.Scanner;

public class Booking {
		private String customerName;
		private String eventDate;
		private String eventTime;
		private int hours;
		
		public void acceptBooking()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer Name");
			this.customerName=sc.next();
			
			System.out.println("Enter Date");
			this.eventDate=sc.next();
			
			System.out.println("Enter Time");
			this.eventTime=sc.next();
			
			System.out.println("Enter Number of Hours");
			this.hours=sc.nextInt();
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getEventDate() {
			return eventDate;
		}

		public void setEventDate(String eventDate) {
			this.eventDate = eventDate;
		}

		public String getEventTime() {
			return eventTime;
		}

		public void setEventTime(String eventTime) {
			this.eventTime = eventTime;
		}

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}
		
		public void displayBooking(Turf turf)
		{
			System.out.println("**** BILL *****");
	        System.out.println("Customer Name "+this.getCustomerName());
	        System.out.println("Court Type "+ turf.getTurfName() );
	        System.out.println("Date "+this.getEventDate());
	        System.out.println("Time "+this.getEventTime());
	        System.out.println("Hours "+this.getHours());
	        System.out.println("Total Payable "+ (turf.getTurfHourlyAmount()*this.getHours()));
		}
		
}
