package javaday1;

import java.util.Scanner;

public class Student {

		private int rno;				//instance scope
		private String studentName;     //instance 
		private String motherName;      //instance
		private double percentage;      //instance
		private static String principalName="Smith";    //static scope
		
		public void acceptStudent()
		{
			int z;  //local scope
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter rno");  //103
			this.rno=sc.nextInt();
			System.out.println("Enter Student name"); //Chris
			this.studentName=sc.next();
			System.out.println("Enter Student Mother Name"); //Christina
			this.motherName=sc.next();
			System.out.println("Enter Student Percentage");  //98.5
			this.percentage=sc.nextDouble();
		}
		
		public void displayStudent()
		{	
			System.out.println("Rno is "+this.rno);
			System.out.println("Student Name  is "+this.studentName);
			System.out.println("Mother Name  is "+this.motherName);
			System.out.println("Percentage  is "+this.percentage);	
		}

		public static void displayPrincipalName()
		{
			System.out.println("Principal Name is "+ Student.principalName);
		}
		public int search(int z)  //this.rno=101 z=102
		{
			if(this.rno==z)
				return 1;
			else 
				return -1;
		}

		public int search(String searchName) {
			if(this.studentName.equals(searchName))
				return 1;
			else 
				return -1;
		}

		public int getRno() {
			return rno;
		}

		public void setRno(int rno) {
			this.rno = rno;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getMotherName() {
			return motherName;
		}

		public void setMotherName(String motherName) {
			this.motherName = motherName;
		}

		public double getPercentage() {
			return percentage;
		}

		public void setPercentage(double percentage) {
			this.percentage = percentage;
		}
		
		
}
