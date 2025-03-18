package day18.multithreading;

public class Bank {

	private double balance;
	
	public Bank() {
		this.balance=5000;
	}
	public Bank(double balance) {
		this.balance=balance;
	}
	
	public synchronized void deposit(double dAmt)
	{
		try
		{
			Thread.sleep(5000);
		}catch(Exception e1) {}
		
		this.balance+=dAmt;
		System.out.println("Amount Credited "+this.balance );
		notify();
		
	}
	
	public synchronized void withdraw(double wAmt)
	{
		if(wAmt>this.balance)   //10000>5000
			try {
				System.out.println("Insufficient Funds "+this.balance );
				wait();
			} catch (InterruptedException e) {}
		this.balance-=wAmt;
		System.out.println("Withdraw Successful "+this.balance );
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
