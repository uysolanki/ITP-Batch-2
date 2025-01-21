package day1a;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int length=sc.nextInt();
		
		System.out.println("Enter Width");
		int width=sc.nextInt();									//buy
		
		int areaRect=length*width;								//cook
		
		System.out.println("Area of Rectangle is "+areaRect);   //serve
	}
}
