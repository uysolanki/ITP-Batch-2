package day18.multithreading;

public class Numeric extends Thread
{

	@Override
	public void run() {
		for(int i=1;i<=26;i++)
			System.out.println(i);
	}
}
