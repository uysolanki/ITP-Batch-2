package javaday10turf.usingabstraction;

public class CricketTurf implements Turf
{

	@Override
	public int getTurfHourlyAmount() {
		return 800;
	}

	@Override
	public String getTurfName() {
		return "Cricket Turf";
	}

}
