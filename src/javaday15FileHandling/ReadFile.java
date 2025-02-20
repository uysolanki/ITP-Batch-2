package javaday15FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
public static void main(String[] args) throws IOException {
	
	FileReader fileReader=new FileReader("itp/file1.txt");
	BufferedReader br=new BufferedReader(fileReader);
	
	String buffer;
	buffer=br.readLine();
	
	System.out.println(buffer);
	
	fileReader.close();
	br.close();
}
}
