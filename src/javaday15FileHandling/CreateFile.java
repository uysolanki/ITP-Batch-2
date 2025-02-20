package javaday15FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
//		FileWriter fileWriter=new FileWriter("itp/file1.txt");
//		fileWriter.write(" to File Handling");
//		
//		fileWriter.close();
//		System.out.println("Data Written to File");
		
		
		FileWriter fileWriter=new FileWriter("itp/file2.txt",true); //append mode
		fileWriter.append("Mahendra Singh Dhoni");
		
		fileWriter.close();
		System.out.println("Data Written to File");

	}

}
