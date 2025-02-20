package javaday15FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCountInMultiLineFile {
public static void main(String[] args) throws FileNotFoundException,IOException {
	FileReader fileReader=new FileReader("itp/file1.txt");
	BufferedReader br=new BufferedReader(fileReader);
	int wordCount=0;
	int LineCount=0;
	String buffer;
	while((buffer=br.readLine())!=null)
	{
		LineCount++;
		for(char c:buffer.toCharArray())
		{
			if(c==' '||c=='\t')
				wordCount++;
		}
	}
	int total=wordCount+LineCount;
	System.out.println("Word Count "+ (total));
	fileReader.close();
	br.close();
}
}
