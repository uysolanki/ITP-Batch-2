package javaday1;

import java.util.Scanner;

public class Student {

		private int rno;				//instance scope
		private String studentName;
		private String motherName;
		private double percentage;
		
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
		
}
