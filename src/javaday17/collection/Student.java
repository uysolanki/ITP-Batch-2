package javaday17.collection;

import java.util.Scanner;

public class Student {
	
	private int rno;
	private String sname;
	private double per;

	
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

	public Student() {}
	public Student(int rno, String sname, double per) {
		this.rno = rno;
		this.sname = sname;
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
	}
	
	
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}

	
}
