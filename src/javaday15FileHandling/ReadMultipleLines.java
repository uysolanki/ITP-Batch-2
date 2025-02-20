package javaday15FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleLines {

	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("itp/file1.txt");
		BufferedReader br=new BufferedReader(fileReader);
		int lineCount=0;
		String buffer;
		while((buffer=br.readLine())!=null)
		{
		lineCount++;
		System.out.println(buffer);
		}
		
		System.out.println("Line Count "+lineCount);
		fileReader.close();
		br.close();

	}

}
