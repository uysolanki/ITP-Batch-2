package javaday15FileHandling;

import java.io.File;

public class CreateFolder {

	public static void main(String[] args) {
		
		File file=new File("itp");
		if(!file.exists())
		{
			file.mkdir();
			System.out.println("Folder Created");
		}

	}

}
