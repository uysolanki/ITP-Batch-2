package javaday14EH;

public class LowQuantityException extends RuntimeException
{
	public LowQuantityException(String errorMsg)
	{
		super(errorMsg);
	}
}
