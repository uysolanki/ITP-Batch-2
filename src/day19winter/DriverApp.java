package day19winter;

public class DriverApp {

	public static void main(String[] args) {
		
		Engine engine1=new Engine(2.5, 2500, "Toyota", "Petrol");
		
		Engine engine2=new Engine();
		engine2.setEngineCC(1200);
		engine2.setEngineLitre(1.2);
		engine2.setEngineMfgName("Tata");
		engine2.setEngineType("Diesel");
		
		Tyre tyre1=new Tyre("Radial", "MRF", 1200);
		
		Tyre tyre2=new Tyre();
		tyre2.setTyreMfgName("Ceat");
		tyre2.setTyrePrice(1500);
		tyre2.setTyreType("Biasply");
		
		Car car1=new Car("SUV", "Toyota", "Fortuner", 5000, engine1,tyre1);
		
		Car car2=new Car();
		car2.setCarMfgName("Tata");
		car2.setCarModelName("Curve");
		car2.setCarPrice(3000);
		car2.setCarType("Sedan");
		car2.setEngine(engine2);
		car2.setTyre(tyre2);
		
		System.out.println(car1);
		System.out.println(car2);
		
		car1.start();

	}

}
