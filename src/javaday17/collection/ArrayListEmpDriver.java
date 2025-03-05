package javaday17.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListEmpDriver {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList();
		
		Employee e1=new Employee(101,"Alice",800,"IT");
		Employee e2=new Employee(102,"Ben",900,"IT");
		Employee e3=new Employee(103,"Chris",1000,"SALES");
		Employee e4=new Employee(104,"David",1100,"SALES");
		Employee e5=new Employee(105,"Elcid",1200,"MARK");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		double sum=0;
		int count=0;
		List<Employee> deptEmployees = new ArrayList();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dept Name");
		String deptName=sc.next();
		
		for(Employee emp:employees)						 //count				sum
		{												 //0					0
			if(emp.getDname().equalsIgnoreCase(deptName))//1					800
			{											 //2					1700
				deptEmployees.add(emp);
			}
		}
		
		System.out.println(deptEmployees);
		
		double maxSalary=0;
		Employee max=null;
		for(Employee deptEmp:deptEmployees)
		{
				if(deptEmp.getSalary()>maxSalary)
				{
					maxSalary=deptEmp.getSalary();
					max=deptEmp;
				}
		}
		System.out.println("Maximum Earning employee in "+deptName.toUpperCase()+ " Dept is " + max.getEname());
	}

}
