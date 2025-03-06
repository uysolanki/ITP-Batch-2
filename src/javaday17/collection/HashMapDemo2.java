package javaday17.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<String,Double> employees=new HashMap();
		employees.put("Alice", 800.0);
		employees.put("Ben", 900.0);
		employees.put("Chris", 1200.0);
		employees.put("David", 1100.0);
		
		double maxSal=0;
		Entry<String,Double> maxEarner=null;
		for(Entry<String,Double> entry:employees.entrySet())
		{
			if(entry.getValue()>maxSal)
			{
				maxSal=entry.getValue();
				maxEarner=entry;
			}
		}
		
		System.out.println(maxEarner.getKey());
		System.out.println(maxEarner.getValue());

	}

}
