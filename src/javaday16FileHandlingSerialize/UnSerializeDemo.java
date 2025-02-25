package javaday16FileHandlingSerialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class UnSerializeDemo {

	public static void main(String[] args) {
		MyStudent s2=null;
		String fileName="itp/ser1.txt";
		
		try {
			FileInputStream fos=new FileInputStream(fileName);
			ObjectInputStream ois=new ObjectInputStream(fos);
			
			s2=(MyStudent)ois.readObject();
			System.out.println(s2);
			s2.displayCoachName();
			
			fos.close();
			ois.close();
			
		} 
		catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		catch (IOException e2) {
				e2.printStackTrace();
		}

	}

}
