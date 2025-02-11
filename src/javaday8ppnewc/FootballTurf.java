package javaday8ppnewc;

public class FootballTurf extends Turf
{
	public String inaugrationBy="Mr Sharma";
    @Override
    public void turfType() 
    {
	System.out.println("Football Turf");
    }

    @Override
	public void turfPerHourRate() 
    {
	System.out.println("1000 per hour");
	}
}
