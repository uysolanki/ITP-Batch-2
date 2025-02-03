package javaday4;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String sname;
	private double per;
	private static int strength;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
		
	}
	public void acceptMyStudentDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rno");
		this.rno=sc.nextInt();
		System.out.println("Enter Name");
		this.sname=sc.next();
		System.out.println("Enter Per");
		this.per=sc.nextDouble();
		Student.strength++;
	}
	
	void displayStudent()
	{
		System.out.println("Rno is" + this.rno);
		System.out.println("Name is" + this.sname);
		System.out.println("Per is" + this.per);
	}
	public static void displayStrength()
	{
		System.out.println("Class Strength :"+Student.strength);
	}
	
}
