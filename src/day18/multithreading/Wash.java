package day18.multithreading;

public class Wash extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try
			{
			System.out.println("\t\tWASH"+i);
			Thread.sleep(1000);
			}
			catch(Exception e1)
			{
				
			}
		}
	}
}
