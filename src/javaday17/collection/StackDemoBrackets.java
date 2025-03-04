package javaday17.collection;

import java.util.Stack;

public class StackDemoBrackets {

	public static void main(String[] args) {
		String input=")([]"; //Valid
		
		if(input.length()%2!=0)
			System.out.println("Invalid Expression");
		else
		{
		boolean result=validity(input);
		if(result)
			System.out.println("Valid");
		else
			System.out.println("Not Valid");
		}

	}

	private static boolean validity(String input) {
		Stack<Character> stack=new Stack();
		
		for(char ch:input.toCharArray())
		{
			if(ch=='['|| ch=='(' || ch=='{')
			{
				stack.push(ch);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			
			char z;
			switch(ch)
			{
			case ')' : 	z=stack.pop();
						if(z!='(')
						{
							return false;
						}
						break;
			case '}' : z=stack.pop();
						if(z!='{')
						{
							return false;
						}
						break;
			case ']' : z=stack.pop();
						if(z!='[')
						{
							return false;
						}
						break;
			}
		}
		return stack.isEmpty();
		}
}
