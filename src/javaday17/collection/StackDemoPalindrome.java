package javaday17.collection;

import java.util.List;
import java.util.Stack;

public class StackDemoPalindrome {

	public static void main(String[] args) {
	
		Stack<Character> stack= new Stack();
		String str="madam";
		for(char ch: str.toCharArray())
			stack.push(ch);
		
		String str2="";
		while(!stack.isEmpty())
			str2=str2.concat(stack.pop()+"");  //'a'==> "a"      str2="madam"
		
		System.out.println(str.equals(str2)?"Palindrome":"Not Palindrome");
		
	}

}
