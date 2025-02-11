package javaday7polymorphism;

public class SplitObjectCreationDemo {

	public static void main(String[] args) {
		    Student s1;   //ref   does not occupy memory
//		
//		
//		    s1=new Student(18,"Virat",78.5);   //C c =new C()
		    s1=new Student(18,"Virat",78.5);
		    s1=new Student(45,"Virat",78.5);
		    s1=new Student(33,"Virat",78.5);
		
			Amitabh a1;  //ref parent  
			
			             //object child
			a1=new Abhishek();  //P  p = new C() ;  Upcasting
			
			a1.home();   //method belongs to the object
						 //data belongs to the ref
			System.out.println(a1.qualification);
	}

}
