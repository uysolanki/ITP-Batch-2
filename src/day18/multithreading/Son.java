package day18.multithreading;

public class Son extends Thread
{
	Bank bank;
	
	public Son(Bank bank)
	{
		this.bank=bank;
	}
	
	@Override
	public void run() {
		bank.withdraw(10000);
	}
	
}
