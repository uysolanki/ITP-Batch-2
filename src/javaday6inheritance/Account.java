package javaday6inheritance;

public class Account {
		protected int accNo;
		protected String accName;
		
		public Account()
		{
			this.accNo=1001;
			this.accName="Alice";
		}
		public Account(int accNo, String accName) {
			this.accNo = accNo;
			this.accName = accName;
		}
		
		public void displayAccount()
		{
			System.out.println("Acc Number is "+this.accNo);
			System.out.println("Acc Name is "+this.accName);
		}
	
}
