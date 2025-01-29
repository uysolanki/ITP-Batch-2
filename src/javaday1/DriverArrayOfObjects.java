package javaday1;

import java.util.Scanner;

public class DriverArrayOfObjects {

	public static void main(String[] args) {
		Student batch[]=new Student[3];
		
		for(int i=0;i<batch.length;i++)
		{
		batch[i]=new Student();
		batch[i].acceptStudent();
		}
		
		for(int i=0;i<batch.length;i++)
		{
		batch[i].displayStudent();
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rno to Search"); //102
		int searchRno=sc.nextInt();
		
		
		for(int i=0;i<batch.length;i++)
		{
		batch[i].search(searchRno);
		}
	}

}
