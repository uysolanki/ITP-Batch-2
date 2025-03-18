package day18.multithreading;

public class Father extends Thread
{
	Bank bank;
	
	public Father(Bank bank)
	{
		this.bank=bank;
	}
	
	@Override
	public void run() {
		bank.deposit(7000);
	}
	
}
