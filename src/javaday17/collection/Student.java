package javaday17.collection;

import java.util.Scanner;

public class Student implements Comparable<Student>
{
	
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

	@Override
	public int compareTo(Student s) {
		
		//desc order of rno
//		if(this.rno>s.rno)
//			return -1;
//		else if(this.rno<s.rno)
//			return 1;
//		else
//			return 0;
		
//		//Asc order of rno
//		if(this.rno>s.rno)
//				return 1;
//		else if(this.rno<s.rno)
//				return -1;
//		else
//				return 0;
		
		
		//desc order of per
//		if(this.per>s.per)
//			return -1;
//		else if(this.per<s.per)
//			return 1;
//		else
//			return 0;
		
		//Asc order of name
		return this.sname.compareTo(s.sname);
	}

	
}
