package javaday17.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class JuiceWordlPriorityQueue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Mango Juices");
		int mangoJuices=sc.nextInt();
		System.out.println("Enter Number of Orange Juices");
		int orangeJuices=sc.nextInt();
		System.out.println("Enter Number of Pineapple Juices");
		int pineappleJuices=sc.nextInt();
		
		int minSeconds=calculateTime(mangoJuices,orangeJuices,pineappleJuices);
		System.out.println("Mininum time taken "+minSeconds);

	}

	private static int calculateTime(int mangoJuices, int orangeJuices, int pineappleJuices) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(mangoJuices);
		pq.add(orangeJuices);
		pq.add(pineappleJuices);
		int seconds=0;
		Iterator<Integer> itr=pq.iterator();
		while(!pq.isEmpty())
		{
			int j1=0;
			int j2=0;
			
			if(itr.hasNext())
			j1=pq.remove();
			
			if(itr.hasNext())
			j2=pq.remove();
			
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				break;
			}
			
			if(j1>0 && j2>0)
			{
				seconds++;
				j1--;
				j2--;
			}
			
			if(j1>0)
				pq.add(j1);
			
			if(j2>0)
				pq.add(j2);
			
		}
		return seconds;
	}
}
