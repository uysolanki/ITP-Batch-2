package day18.multithreading;

public class Alpha implements Runnable
{
@Override
public void run() {
	for(char i='A';i<='Z';i++)
		System.out.println("\t"+i);
}
}
