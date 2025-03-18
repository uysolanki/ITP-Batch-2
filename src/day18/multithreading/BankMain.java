package day18.multithreading;

public class BankMain {

	public static void main(String[] args) throws InterruptedException {
		Bank bank=new Bank();   //balance 5000
		
		Son thread1=new Son(bank);
		Father thread2=new Father(bank);
		
		thread1.start();
		Thread.sleep(500);
		thread2.start();
		

	}

}
