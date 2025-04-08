package day19winter;

public class Engine {
		
	private double engineLitre;  //1.2
	private int engineCC;
	private String engineMfgName;
	private String engineType;
	
	
	public Engine() {} //No Args Constructor
	
	//All Args Constructor
	public Engine(double engineLitre, int engineCC, String engineMfgName, String engineType) {
		super();
		this.engineLitre = engineLitre;
		this.engineCC = engineCC;
		this.engineMfgName = engineMfgName;
		this.engineType = engineType;
	}

	public double getEngineLitre() {
		return engineLitre;
	}

	public void setEngineLitre(double engineLitre) {
		this.engineLitre = engineLitre;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public String getEngineMfgName() {
		return engineMfgName;
	}

	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineLitre=" + engineLitre + ", engineCC=" + engineCC + ", engineMfgName=" + engineMfgName
				+ ", engineType=" + engineType + "]";
	}
}
