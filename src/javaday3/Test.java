package javaday3;

public class Test {
	
	static int x,y;
	
	static {    //used to initialise static variables of the class
		x=10;   //it is executed before main()
		y=20;
		System.out.print("Virat");
	}
	
public static void main(String[] args) {
	System.out.println("Kohli");
}
}


//output ViratKohli