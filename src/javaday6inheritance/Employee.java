package javaday6inheritance;

import java.util.Scanner;

public class Employee extends Person
{
	private int eno;	    //Total DM=7
	private String desg;
	private double sal;
	
	public Employee()
	{
		super();//invoke no args constructor
		this.eno=101;
		this.desg="Manager";
		this.sal=800;
		
	}
	public Employee(long adharNo, String name, int age, String address,int eno,String desg,double sal)
	{
		super(adharNo,  name, age, address);
		this.eno=eno;
		this.desg=desg;
		this.sal=sal;	
	}
	
	
	public void acceptEmployee()  //Total methods=2
	    {
		 	super.acceptPerson();
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter Eno");
	    	this.eno=sc.nextInt();
	    	System.out.println("Enter Designation");
	    	this.desg=sc.next();
	    	System.out.println("Enter Salary");
	    	this.sal=sc.nextDouble();

	    }
	    
	    public void displayEmployee()
	    {	
	    	super.displayPerson();
	    	System.out.println("Eno is "+this.eno);
	    	System.out.println("Designation is "+this.desg);
	    	System.out.println("Salary is "+this.sal);	
	    }
}
