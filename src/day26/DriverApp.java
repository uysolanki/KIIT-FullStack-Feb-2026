package day26;

public class DriverApp {

	public static void main(String[] args) {
		Engine engine1=new Engine(1000, 1, "Petrol", "Toyota");
		
		Engine engine2=new Engine();
		engine2.setEngineCC(2000);
		engine2.setEngineLiter(2);
		engine2.setEngineMfg("Honda");
		engine2.setEngineType("Diesel");
		
		Gear gear1=new Gear(6,"Tata","Automatic");
		
		Gear gear2=new Gear();
		gear2.setGearLever(8);
		gear2.setGearMfg("Reliance");
		gear2.setGearType("Manual");
		
		Car car1=new Car("Fortuner","Toyota", 300.0, "White", engine1, gear2); //CDI
		
		Car car2=new Car();
		car2.setCarColor("Black");
		car2.setCarMfg("Mahindra");
		car2.setCarModel("Thar");
		car2.setCarPrice(200.0);
		car2.setEngine(engine2);
		car2.setGear(gear2);
		
		System.out.println(car1);
		System.out.println(car2);

	}

}


//store the 