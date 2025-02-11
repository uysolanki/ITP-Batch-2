package javaday5;

public class DriverApp {

	public static void main(String[] args) {
		Student s1=new Student();  //default constructor
		//s1.displayStudent();
		
		Student s2=new Student();
		Student s3=new Student();
		
//		s2.displayStudent();
//		s3.displayStudent();
		Student s4=new Student(18,"Virat",78.5,true);
		//s4.displayStudent();
		
		Student s5=new Student(45,"Smriti",true,88.5);
		//s5.displayStudent();
		
//		Student s6=new Student(s5);
//		s6.displayStudent();

	}

}
