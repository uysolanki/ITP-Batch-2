package javaday14EH;

public class InvalidNameException extends RuntimeException
{
	public InvalidNameException(String errorMsg)
	{
		super(errorMsg);
	}
}
