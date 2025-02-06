package javaday7polymorphism;

public class PolymorphismDriver {

	public static void main(String[] args) {
		
		//refrence
		//pointer =  Object
		Abhishek a1=new Abhishek();
		a1.car();  //Audi
		a1.car(5); //BMW
		a1.home(); //New Jalsa
		a1.office("Apple");
		a1.office(5);
	}

}
