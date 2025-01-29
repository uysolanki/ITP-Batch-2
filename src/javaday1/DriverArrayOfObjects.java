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
//		System.out.println("Enter rno to Search"); //103
//		int searchRno=sc.nextInt();
//		
//		int i;
//		for(i=0;i<batch.length;i++)
//		{
//		int result=batch[i].search(searchRno);
//		if(result==1)
//		{
//			System.out.println("Found");
//			break;
//		}
//		}
//		if(i==batch.length)
//			System.out.println("Not Found");
		
		
		System.out.println("Enter Name to Search"); //103
		String searchName=sc.next();
		
		int i;
		for(i=0;i<batch.length;i++)
		{
		int result=batch[i].search(searchName);
		if(result==1)
		{
			System.out.println("Found");
			break;
		}
		}
		if(i==batch.length)
			System.out.println("Not Found");
		
		
	}

}
