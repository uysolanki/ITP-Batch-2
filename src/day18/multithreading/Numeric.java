package day18.multithreading;

public class Numeric extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=26;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e1) {}
		}
		
	}
}
