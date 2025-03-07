package javaday17.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
//First Repeated char from a String
public class HashMapDemo5 {

	public static void main(String[] args) {
			String name="aabbaccdabbeffgh"; //"virat kohli" Rohit Sharma
			
			Map<Character,Integer> counter=new HashMap();
			for(char c:name.toCharArray())
			{
				if(!Character.isWhitespace(c))
				counter.put(c, counter.getOrDefault(c, 0)+1);
			}
			System.out.println(counter);
			
			for(char c:name.toCharArray())
			{
				if(counter.get(c)>1)
				{
					System.out.println(c);
					break;
				}
			}
	}												
}													
													