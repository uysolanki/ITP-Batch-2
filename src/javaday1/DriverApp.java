package javaday1;

public class DriverApp {

	public static void main(String[] args) {
		
		Student.displayPrincipalName();
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.acceptStudent();
		s2.acceptStudent();
		s3.acceptStudent();
//		s1.rno
//		s3.displayStudent();
		s1.displayStudent();
		s2.displayStudent();
		
		test();
		
	}
	
	static void test()
	{
		
	}

}
