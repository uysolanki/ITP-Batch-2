package day18.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		
		Alpha thread1=new Alpha();
		Numeric thread2=new Numeric();
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		thread1.setPriority(1);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		
		thread1.start();
		thread2.start();
//		for(char i='a';i<='z';i++)
//			System.out.println("\t\t"+i);

	}

}
