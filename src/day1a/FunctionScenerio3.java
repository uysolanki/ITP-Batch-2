package day1a;

import java.util.Scanner;

public class FunctionScenerio3 {

	public static void main(String[] args) {
		manager();
	}
	
	private static void manager() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int ilength=sc.nextInt();
		
		System.out.println("Enter Width");
		int iwidth=sc.nextInt();									 //buy
		
		int areaRect=areaOfRectangle(ilength,iwidth);		             //call	
		System.out.println("Area of Rectangle is "+areaRect);          //serve
		
		int periRect=perimeterOfRectangle(ilength,iwidth);		             //call	
		System.out.println("Area of Rectangle is "+periRect);
	}

	private static int perimeterOfRectangle(int ilength, int iwidth) {
		return  2*(ilength+iwidth);								         //cook
	}

	private static int areaOfRectangle(int len, int wd ) 
	{
		int areaRect=len*wd;								         //cook
		return areaRect;	
	}
}
