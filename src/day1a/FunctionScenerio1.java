package day1a;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args) {
		areaOfRectangle();										//call	
		System.out.println("gn");
	}

	
	private static void areaOfRectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int length=sc.nextInt();
		
		System.out.println("Enter Width");
		int width=sc.nextInt();									//buy
		
		int areaRect=length*width;								//cook
		
		System.out.println("Area of Rectangle is "+areaRect);   //serve
		perimeterOfRectangle();
		System.out.println("bye");
	}
	
	private static void perimeterOfRectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int length=sc.nextInt();
		
		System.out.println("Enter Width");
		int width=sc.nextInt();									//buy
		
		int periRect=2*(length+width);								//cook
		
		System.out.println("Permeter of Rectangle is "+periRect);   //serve	
		
		System.out.println("hi");
	}
}
