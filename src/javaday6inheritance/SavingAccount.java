package javaday6inheritance;

public class SavingAccount extends Account
{

		private double savingAccountBalance;
		private double savingAccountROI;
		
		public SavingAccount()
		{
			super();
			this.savingAccountBalance=1000;
			this.savingAccountROI=7.5;
		}
		public SavingAccount(int accNo, String accName,double savingAccountBalance,double savingAccountROI)
		{
			super(accNo,accName);
			this.savingAccountBalance=savingAccountBalance;
			this.savingAccountROI=savingAccountROI;
		}
		
		public void displaySavingAccount()
		{
			super.displayAccount();
			System.out.println("Saving Acc Balance is "+this.savingAccountBalance);
			System.out.println("Saving Acc ROI is "+this.savingAccountROI);
		}
		
}
