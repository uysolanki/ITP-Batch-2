package javaday11array;

public class ArrayOfString {
	public static void main(String[] args) {
String names[]= {"Aditya", "Bhushan","Bhawesh","Shubham","Sanket", "Piyush"};
		
		for(String name:names)
			//if(name.length()>6)
			//if(name.startsWith("B"))
			if(name.endsWith("h"))
			System.out.println(name + " is pursuing FSD");
	}
		
}
