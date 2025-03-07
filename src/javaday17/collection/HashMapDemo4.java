package javaday17.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo4 {

	public static void main(String[] args) {
//	int arr[]= {1,2,3,4,5};   //oddcount =3 ,eventcount =2
//	int oddc=0;
//	int evenc=0;
//	
//	for(int n:arr)
//	{
//		if(n%2==0)
//			evenc++;
//		else
//			oddc++;
//	}
//	
//	System.out.println("Even Count "+evenc);
//	System.out.println("Odd Count "+oddc);
	
	
	
	String sentance="my name is alice alice is a good name is";
	String words[]=sentance.split(" ");
	System.out.println(sentance);
	System.out.println(Arrays.toString(words));
	Map<String,Integer> counter=new HashMap();
	for(String word:words)
	{
		if(counter.containsKey(word))
		{
			counter.put(word, counter.get(word)+1);
		}
		else
		{
			counter.put(word, 1);					//my	1
		}											//name  1
	}	
		System.out.println(counter);											//is 	3
	}												//alice 2
}													//a     1
													//good  1