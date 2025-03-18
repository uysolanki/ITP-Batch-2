package day18.multithreading;

public class Soak extends Thread
{
	@Override
	public void run() {
		for(int i=1;i<=15;i++)
		{
			try
			{
			System.out.println("\tSOAK"+i);
			Thread.sleep(1000);
			}
			catch(Exception e1)
			{
				
			}
		}
	}
}
