package javaday10turf.usingabstraction;

public class TennisTurf implements Turf
{

	@Override
	public int getTurfHourlyAmount() {
		return 1500;
	}

	@Override
	public String getTurfName() {
		return "Tennis Turf";
	}

}
