package day18.multithreading;

public class Alpha implements Runnable
{
@Override
public void run() {
	for(char i='A';i<='Z';i++)
	{
		try
		{
		System.out.println("\t"+i);
		Thread.sleep(2000);
		}
		catch(Exception e1)
		{
			
		}
	}
}
}
