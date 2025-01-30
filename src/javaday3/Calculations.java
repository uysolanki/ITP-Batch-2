package javaday3;

import java.util.Scanner;
import static java.lang.Math.*;
public class Calculations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius"); //103
		int radius=sc.nextInt();
	
		System.out.println(PI*radius*radius);    //78 cr 50 lakh  78cr 4 lakh
		
		System.out.println("Enter Year of Birth"); //103
		int yob=sc.nextInt();
		
		System.out.println("Age is " + abs(yob-2024));
		
		System.out.println(sqrt(5));
		

	}

	
}
