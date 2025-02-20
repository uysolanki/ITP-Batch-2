package javaday15FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInSingleLineFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fileReader=new FileReader("itp/file2.txt");
		BufferedReader br=new BufferedReader(fileReader);
		
		String buffer;
		buffer=br.readLine();
		int wordCount=0;
		for(char c:buffer.toCharArray())
		{
			if(c== ' '||c=='\t')
				wordCount++;
		}
		
		System.out.println("Number of Words " + (++wordCount));
		fileReader.close();
		br.close();

	}

}
