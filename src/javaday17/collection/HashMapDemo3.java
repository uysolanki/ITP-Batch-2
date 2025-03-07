package javaday17.collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo3 {

	public static void main(String[] args) {
		Map<String,Double> employees=new HashMap();
		//keys ---> before first
		employees.put("Alice", 800.0);
		employees.put("Ben", 900.0);
		employees.put("Chris", 1200.0);
		employees.put("David", 1100.0);
		
		System.out.println(employees);
		
		//1. Using Enhanced For Loop
		for(String key:employees.keySet())
		{
			System.out.println(key + "," + employees.get(key));
		}
		
		//2. Using Iterator
		Iterator<String> keys = employees.keySet().iterator();
		
		while(keys.hasNext())
		{
			String key=keys.next();
			System.out.println(key + "#" + employees.get(key));
		}
		
		//3. Using Enumeration
		Enumeration<String> keys1 = Collections.enumeration(employees.keySet());
		
		while(keys1.hasMoreElements())
		{
			String key=keys1.nextElement();
			System.out.println(key + "*" + employees.get(key));
		}
		
		//4. Using Entry
		for(Entry<String,Double> row:employees.entrySet())
		{
			System.out.println(row.getKey() + "$" + row.getValue());
		}

		
		//5. Lambda Expression
		System.out.println("-------");
		
		employees.keySet().forEach(
				(key)->{
					System.out.println(key + "&&" + employees.get(key));
				}
				);
	}

}
