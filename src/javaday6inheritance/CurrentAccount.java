package javaday6inheritance;

public class CurrentAccount extends Account
{

	private double currentAccountBalance;
	private double currentAccountROI;
	
	public CurrentAccount()
	{
		super();
		this.currentAccountBalance=5000;
		this.currentAccountROI=6.5;
	}
	
	public CurrentAccount(int accNo, String accName,double currentAccountBalance,double currentAccountROI)
	{
		super(accNo,accName);
		this.currentAccountBalance=currentAccountBalance;
		this.currentAccountROI=currentAccountROI;
	}
	
	public void displayCurrentAccount()
	{
		super.displayAccount();
		System.out.println("Current Acc Balance is "+this.currentAccountBalance);
		System.out.println("Current Acc ROI is "+this.currentAccountROI);
	
	}
	
}
