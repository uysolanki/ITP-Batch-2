package javaday17.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers1=new HashSet();
	
		
		numbers1.add(10);
		numbers1.add(50);
		numbers1.add(20);
		numbers1.add(30);
		numbers1.add(40);
		System.out.println(numbers1);
		
		
		Set<Integer> numbers2=new LinkedHashSet();
		numbers2.add(10);
		numbers2.add(50);
		numbers2.add(20);
		numbers2.add(30);
		numbers2.add(40);
		System.out.println(numbers2);
		
		
		Set<Integer> numbers=new TreeSet();
		numbers.add(10);
		numbers.add(50);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		System.out.println(numbers);
		
		Set<String> names=new TreeSet();
		names.add("Tom");
		names.add("Jerry");
		names.add("Alice");
		names.add("Ben");
		
		System.out.println(names);
		
		
		//------------------------------------
		
		Student s1=new Student(18,"Virat",78.5);
		Student s2=new Student(1,"Rahul",88.5);
		Student s3=new Student(45,"Rohit",68.5);
		
		Set<Student> students=new TreeSet(new SnameComparatorAsc());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
