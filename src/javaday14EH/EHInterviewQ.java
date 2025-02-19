package javaday14EH;

import java.util.Arrays;

public class EHInterviewQ {

	public static void main(String[] args) {
//		String s1="123.4";
//		String s2="123";
//		System.out.println(s1+s2);
//		
//		double n1=Double.parseDouble(s1);
//		int n2=Integer.parseInt(s2);
//		System.out.println(n1+n2);
		
		String sentance = "My name is Alice I am 9 years old I have 1 brother and 1 sister";
		
		//count the number of Integers in this String
		
		String words[]=sentance.split(" ");
		System.out.println(Arrays.toString(words));
		int counter=0;
		for(String word:words)
		{
			try
			{
			Integer n1=Integer.parseInt(word);
			counter++;
			}
			catch(NumberFormatException e1)
			{
				
			}
		}
		
		System.out.println(counter);
	}

}
