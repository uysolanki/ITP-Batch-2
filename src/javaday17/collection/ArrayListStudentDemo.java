package javaday17.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStudentDemo {
public static void main(String[] args) {
	Student s1=new Student(18,"Virat",78.5);
	Student s2=new Student(1,"Rahul",88.5);
	Student s3=new Student(45,"Rohit",68.5);
	
	List<Student> m100=new ArrayList();
	m100.add(s1);
	m100.add(s2);
	m100.add(s3);
	
	System.out.println(m100);
	
	Student s4=new Student(33,"Hardik",67.5);
	Student s5=new Student(44,"Shubman",73.5);
	Student s6=new Student(17,"Rishab",59.5);
	
	List<Student> m200=new ArrayList();
	m200.add(s4);
	m200.add(s5);
	m200.add(s6);
	
	System.out.println(m200);
	
	List<List<Student>> olympic =new ArrayList();
	olympic.add(m100);
	olympic.add(m200);
	
	System.out.println(olympic);
	
	System.out.println(olympic.get(0).get(0).getSname());
}
}
