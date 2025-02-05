package javaday6inheritance;

public class SingleInheritanceDriver {

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee(9876,"Ben",23,"Delhi",102,"Clerk",600);
//		e1.acceptEmployee();
		e1.displayEmployee();
		e2.displayEmployee();

	}

}
