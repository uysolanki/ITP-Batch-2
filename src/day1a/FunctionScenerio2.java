package day1a;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args) {
		int result=areaOfRectangle();										//call	
		System.out.println("Area of Rectangle is "+result);   //serve
	}

	
	private static int areaOfRectangle() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int length=sc.nextInt();
		
		System.out.println("Enter Width");
		int width=sc.nextInt();									//buy
		
		int areaRect=length*width;								//cook
		
		return areaRect;
		
	}
	
}
