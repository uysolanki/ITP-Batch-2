package javaday10turf.usingabstraction;

public class FootballTurf implements Turf
{

	@Override
	public int getTurfHourlyAmount() {
		return 1000;
	}

	@Override
	public String getTurfName() {
		return "Football Turf";
	}

}
