package javaday4;

public class DriverApp {

	public static void main(String[] args) {
		Student.displayStrength();  //Class Strength : 0
		
		Student s1=new Student();
		s1.acceptStudent();         //1 Dinesh 78.5  Class Strength : 1
		
		Student s2=new Student();
		s2.acceptStudent();         //2 Aditya 88.5  Class Strength : 2
		
		Student.displayStrength(); // Class Strength : 2
		s1.displayStrength();      // Class Strength : 2
		s2.displayStrength();      // Class Strength : 2
		
	}

}
