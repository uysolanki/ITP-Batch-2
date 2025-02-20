package javaday15FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindWordOccuranceCountInMultiLineFile {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		FileReader fileReader=new FileReader("itp/file1.txt");
		BufferedReader br=new BufferedReader(fileReader);
		String buffer;
		int index=0;
		int occuranceCount=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Word to Search");
		String search=sc.next().toLowerCase();
		
		while((buffer=br.readLine())!=null)
		{
			do
			{
				index=buffer.toLowerCase().indexOf(search,index);  //index=17
					if(index!=-1)
					{
						occuranceCount++;				//wc= 0, 1,2
						index=index+search.length();//index=17
					}
					
			}while(index!=-1);
		}
		
		System.out.println("Occurance Count " + occuranceCount);
		fileReader.close();
		br.close();

	}

}
