package javaday6inheritance;

public class HierarchicleInheritanceDemo {

	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount();
		s1.displaySavingAccount();
		
		SavingAccount s2=new SavingAccount(1777,"Ben",9999,9.9);
		s2.displaySavingAccount();
	}

}
