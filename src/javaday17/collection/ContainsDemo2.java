package javaday17.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsDemo2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		List<Integer> numbers=new ArrayList(Arrays.asList(10,20,30,40,50,60,70));
		int sum=100;
		int flag=0;
		for(int n1:numbers)
		{								//n1=10
			int n2=sum-n1;				//n2=80
			if(numbers.contains(n2) && n1!=n2 && n1<n2)
			{
				System.out.println("[" +n1+ ","+ n2+"]");
				flag=1;
				//break;
			}
		}
		if(flag==0)
		System.out.println("No Pair Found");
	}
}
