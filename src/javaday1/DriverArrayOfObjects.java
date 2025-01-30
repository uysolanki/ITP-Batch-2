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
		
		
//		System.out.println("Enter Name to Search"); //103
//		String searchName=sc.next();
//		
//		int i;
//		for(i=0;i<batch.length;i++)
//		{
//		int result=batch[i].search(searchName);
//		if(result==1)
//		{
//			System.out.println("Found");
//			break;
//		}
//		}
//		if(i==batch.length)
//			System.out.println("Not Found");
//		
		
//		
//		double maxPer=batch[0].getPercentage();

//		for(int j=1;j<batch.length;j++)
//		{
//			if(batch[j].getPercentage()>maxPer)
//			{
//				maxPer=batch[j].getPercentage();
//			}
//		}
//		System.out.println(maxPer);
		
		
//		Student topper=batch[0];
//		for(int j=1;j<batch.length;j++)
//		{
//			if(batch[j].getPercentage()>topper.getPercentage())
//			{
//				topper=batch[j];
//			}
//		}
//		System.out.println("Topper Details");
//		topper.displayStudent();
		
		batch[0].displayPrincipalName();
		batch[1].displayPrincipalName();
		batch[2].displayPrincipalName();
		
		
	}
	
	

}
