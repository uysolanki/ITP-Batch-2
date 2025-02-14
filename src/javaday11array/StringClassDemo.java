package javaday11array;

public class StringClassDemo {

	public static void main(String[] args) {
		String s1="Alice";  //String literal
		
//		String s2=new String("Alice");  //String object
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		System.out.println(s1);
//		String s2=s1.concat("Peter");
//		System.out.println(s1);
//		System.out.println(s2);
		             //0
//		String name="mahendra singh dhoni";   //['a','l','i','c','e']
//		int counter=0;
//		char alphabets[]=name.toCharArray();
//		for(char ch:alphabets)
//		{
//			if(ch==' ')
//				counter++;
//		}
//		
//		System.out.println(++counter);
//		
		String name="Mahendra Singh Dhoni";
//		String middleName=name.substring(9,14);
//		System.out.println(middleName);	//singh
//		
//		String lastName=name.substring(15);
//		System.out.println(lastName);	//Dhoni
		
		String newName=name.replace("Singh", "Kumar");
		System.out.println(newName);
		
		System.out.println(name.charAt(2));
		
		System.out.println(name.indexOf('a'));
		System.out.println(name.lastIndexOf('a'));	
	}
}
