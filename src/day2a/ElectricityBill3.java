package day2a;

import java.util.Scanner;

public class ElectricityBill3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter previous month Reading");   // 100
		int prevMonthReading=sc.nextInt();   
		
		System.out.println("Please enter current month Reading");    //75
		int currentMonthReading=sc.nextInt();    
		if(currentMonthReading>prevMonthReading)
		{
		int units=Math.abs(currentMonthReading-prevMonthReading);
		
		double billAmount=0;
		if(units<=100)
		{
			billAmount=units*2.5;
		}
		else if(units>100  && units<=200)
		{
			billAmount=100*2.5 + (units-100)*3.5;
		}
		else if(units>200  && units<=300)
		{
			billAmount=100*2.5 + 100*3.5 + (units-200)*4.5;
		}
		else
		{
			billAmount=100*2.5 + 100*3.5 + 100*4.5 +(units-300)*5.5;
		}
		
		
		billAmount+=100;
		System.out.println(String.format("%-30s", "Below 100 Units") + "Rs " +String.format("%-5.2f", 2.5));
		System.out.println(String.format("%-30s", "101 to 200 Units") + "Rs " +String.format("%-5.2f", 3.5));
		System.out.println(String.format("%-30s", "201 to 300 Units") + "Rs " +String.format("%-5.2f", 4.5));
		System.out.println(String.format("%-30s", "Above 300 Units") + "Rs " +String.format("%-5.2f", 5.5));
		System.out.println(String.format("%-30s", "Fixed Meter Charges") + "Rs " +String.format("%-5d", 100));
		
		System.out.println(String.format("%-30s", "-----------------------------") +String.format("%-5s", "-------"));
		
		System.out.println(String.format("%-30s", "Previous Meter Reading") + String.format("%-10d", prevMonthReading));
		System.out.println(String.format("%-30s", "Current Meter Reading") + String.format("%-10d", currentMonthReading));
		System.out.println(String.format("%-30s", "Units Consumed Charges") + String.format("%-10f", billAmount-100));
		System.out.println(String.format("%-30s", "Meter Charges") + String.format("%-10d", 100));
		System.out.println(String.format("%-30s", "Total Payable Before Due Date") + String.format("%-10f",billAmount));
		System.out.println(String.format("%-30s", "Due Date ") + String.format("%-15s", "31-Jan-2025"));
		System.out.println(String.format("%-30s", "Total Payable After Due Date") + String.format("%-10f",billAmount+billAmount*0.01));
		}
		else
		{
			System.out.println("Faulty Meter");
		}
		
		
		
	}

}
