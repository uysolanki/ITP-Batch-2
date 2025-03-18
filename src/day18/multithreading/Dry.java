package day18.multithreading;

public class Dry extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try
			{
			System.out.println("\t\t\tDRY"+i);
			Thread.sleep(1000);
			}
			catch(Exception e1)
			{
				
			}
		}
	}
}
