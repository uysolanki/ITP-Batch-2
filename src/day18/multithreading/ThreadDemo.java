package day18.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Alpha thread1=new Alpha();
		Numeric thread2=new Numeric();
		
		Thread tx=new Thread(thread1);
		tx.start();
		
		thread2.start();
		for(char i='a';i<='z';i++)
			System.out.println("\t\t"+i);

	}

}
