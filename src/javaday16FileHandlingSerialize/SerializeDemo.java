package javaday16FileHandlingSerialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
	MyStudent s1=new MyStudent();
	s1.setRno(45);
	s1.setSname("Rohit");
	s1.setPer(87.5);
	s1.setGender("male");
	s1.setMp(99);
	
	String fileName="itp/ser1.txt";
	
	try {
		FileOutputStream fos=new FileOutputStream(fileName);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		System.out.println("Object Written to file");
		
		fos.close();
		oos.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	}
	

	}

}
