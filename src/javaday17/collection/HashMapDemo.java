package javaday17.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String,Double> employees=new HashMap();
		employees.put("Alice", 800.0);
		employees.put("Ben", 900.0);
		employees.put("Chris", 1200.0);
		employees.put("David", 1100.0);
		
		//System.out.println(employees);
		
		Map<String,List<String>> students=new TreeMap();
		students.put("FSD",new ArrayList(Arrays.asList("Alice","Ben","Chris")));
		students.put("Testing",new ArrayList(Arrays.asList("David","Elcid","Frank")));
		students.put("DS",new ArrayList(Arrays.asList("George")));
		students.put("Java",new ArrayList(Arrays.asList("Alice","Ben","Chris")));
		students.put("Dotnet",new ArrayList(Arrays.asList("David","Elcid","Frank")));
		students.put("Java",new ArrayList(Arrays.asList("George")));
//		students.put(null,new ArrayList(Arrays.asList("George")));
//		students.put(null,new ArrayList(Arrays.asList("George")));
//		
		students.put("C",null);
		students.put("Cpp",null);
		students.put("Php",null);
		
		
		System.out.println(students);
		
//		System.out.println("Testing Students "+students.get("Testing"));
//		
		for(Entry<String,List<String>> entry:students.entrySet())
		{
			if(entry.getKey().equals("Testing"))
				System.out.println(entry.getValue());
		}

	}

}


//HashMap				order is not preserved 1 null key allowed
//LinkedHashMap			order is preserved 1 null key allowed
//TreeMap				ASC order No null key allowed
