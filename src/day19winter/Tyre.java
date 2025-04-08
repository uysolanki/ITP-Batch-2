package day19winter;

public class Tyre {

	private String tyreType;
	private String tyreMfgName;
	private double tyrePrice;
	
	public Tyre() {}
	public Tyre(String tyreType, String tyreMfgName, double tyrePrice) {
		this.tyreType = tyreType;
		this.tyreMfgName = tyreMfgName;
		this.tyrePrice = tyrePrice;
	}
	public String getTyreType() {
		return tyreType;
	}
	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}
	public String getTyreMfgName() {
		return tyreMfgName;
	}
	public void setTyreMfgName(String tyreMfgName) {
		this.tyreMfgName = tyreMfgName;
	}
	public double getTyrePrice() {
		return tyrePrice;
	}
	public void setTyrePrice(double tyrePrice) {
		this.tyrePrice = tyrePrice;
	}
	
	@Override
	public String toString() {
		return "Tyre [tyreType=" + tyreType + ", tyreMfgName=" + tyreMfgName + ", tyrePrice=" + tyrePrice + "]";
	}
	

}
