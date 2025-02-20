package javaday15FileHandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReverseFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
//		FileReader fileReader=new FileReader("itp/file1.txt");
//		BufferedReader br=new BufferedReader(fileReader);
//		
//		String buffer;
//		buffer=br.readLine();
//		
//		StringBuffer sb=new StringBuffer(buffer);
//		System.out.println(sb.reverse());
//		
//		fileReader.close();
//		br.close();
		
		
		//reverse line by line
//		FileReader fileReader=new FileReader("itp/file1.txt");
//		BufferedReader br=new BufferedReader(fileReader);
//		
//		String buffer;
//		while((buffer=br.readLine())!=null)
//		{
//		StringBuffer sb=new StringBuffer(buffer);
//		System.out.println(sb.reverse());
//		}
//		fileReader.close();
//		br.close();
		
		
		FileInputStream fis=new FileInputStream("itp/file1.txt");
		int buffer;
		
		
		StringBuffer sb=new StringBuffer("");  //1000
		while((buffer=fis.read())!=-1)
		{
			char ch=(char)buffer;
			if(ch!='\n')
			sb.append(ch);
		}
		
		System.out.println(sb.reverse());
			
		
		fis.close();
		
	}

}
