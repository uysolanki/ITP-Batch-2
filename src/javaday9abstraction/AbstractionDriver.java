package javaday9abstraction;

public class AbstractionDriver {
public static void main(String[] args) {
	Shape2D s;
	s=new Circle();
	s.area();
	s.perimeter();
	
	Rectangle r;
	r=new FootballField();
	r.area();
	r.perimeter();
	
}
}
