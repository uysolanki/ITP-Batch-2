package javaday9abstraction;

public class Circle implements Shape2D
{

	@Override
	public void area() {
		System.out.println("PI R Square");
		
	}

	@Override
	public void perimeter() {
		System.out.println("2 PI R");
		
	}

	
	void test()
	{
		System.out.println("AA");
	}
}
