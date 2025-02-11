package javaday8ppnewc;

public class UpcastingDemo 
{
	final double PI=3.14;
	
	public static void main(String[] args) {
		CricketTurf c1=new CricketTurf();
		c1.turfType();
		c1.turfPerHourRate();
		System.out.println(c1.inaugrationBy);
		
		FootballTurf f1=new FootballTurf();
		f1.turfType();
		f1.turfPerHourRate();
		System.out.println(f1.inaugrationBy);
		
		Turf t1;
		
		t1=new CricketTurf();
		t1.turfType();
		t1.turfPerHourRate();
		t1.test();
		System.out.println(t1.inaugrationBy);
		
		t1=new FootballTurf();
		t1.turfType();
		t1.turfPerHourRate();
		System.out.println(t1.inaugrationBy);
		
	}
	
	public int areaCirlce(int radius)
	{
		return 1;
	}
	
	
	public String test1()
	{
		return "Apple";
	}
	
	public Object test2()
	{
		TennisTurf t1=new TennisTurf();
		return "Apple";
	}
}
