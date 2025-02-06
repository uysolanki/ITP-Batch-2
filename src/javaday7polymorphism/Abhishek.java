package javaday7polymorphism;

public class Abhishek extends Amitabh
{
	public String qualification="BCOM";
    
	@Override
	void home() {
		System.out.println("New Jalsa");
	}
	
public void car(int n)
{
	System.out.println("BMW");
}
void office(int n)
{
	System.out.println("Andheri Office");
}
void office(String n)
{
	System.out.println("Bandra Office");
}
}
