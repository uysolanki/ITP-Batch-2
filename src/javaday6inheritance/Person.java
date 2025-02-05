package javaday6inheritance;

import java.util.Scanner;

public class Person {
		
		protected long adharNo;   //Total DM =4 
		protected String name;
		protected int age;
		protected String address;
		
		public Person() {      //setting total 4 properties
			this.adharNo = 1122;
			this.name = "Alice";
			this.age = 18;
			this.address = "Pune";
		}							 //setting total 4 properties
	    public Person(long adharNo, String name, int age, String address) {
			this.adharNo = adharNo;
			this.name = name;
			this.age = age;
			this.address = address;
		}

		public void acceptPerson()  //Total methods=2
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter adharNo");
	    	this.adharNo=sc.nextLong();
	    	System.out.println("Enter Name");
	    	this.name=sc.next();
	    	System.out.println("Enter Age");
	    	this.age=sc.nextInt();
	    	System.out.println("Enter Address");
	    	this.address=sc.next();
	    }
	    
	    public void displayPerson()
	    {
	    	System.out.println("AdharNo is "+this.adharNo);
	    	System.out.println("Name is "+this.name);
	    	System.out.println("Age is "+this.age);
	    	System.out.println("Address is "+this.address);
	    }
}
