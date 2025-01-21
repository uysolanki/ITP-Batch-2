package day2a;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter UNITS consumed");
		int units=sc.nextInt();    //225
		
		double billAmount=0;
		if(units<=100)
			billAmount=units*2.5;
		
		else if(units>100  && units<=200)
			billAmount=100*2.5 + (units-100)*3.5;

		else if(units>200  && units<=300)
			billAmount=100*2.5 + 100*3.5 + (units-200)*4.5;
		
		else
			billAmount=100*2.5 + 100*3.5 + 100*4.5 +(units-300)*5.5;
				
		billAmount+=100;
		
		System.out.println("Total Payable "+billAmount);
	}

}
