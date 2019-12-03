class Vehicle {
	String modelName, company, owner, engineType;  
	public String toString() {
		return new String("ModelName: " + modelName + ", Company: " + company + ", Owner: " + owner + ", EngineType: " + engineType);
	}

	public void setModelName(String m) { modelName = m; }
	public void setCompany(String c) { company = c; }
	public void setOwner(String o) { owner = o; }
	public void setEngineType(String e) { engineType = e; }

	public String getModelName() { return modelName; }
	public String getCompany() { return company; }
	public String getOwner() { return owner; }
	public String getEngineType() { return engineType; }
}

class Car extends Vehicle {
	int numberOfSeat;
        Car() {}

	Car(String m, String c, String o, String e, int n) {
		modelName = m;
		company = c;
		owner = o;
		engineType = e;
		numberOfSeat = n;
	}
}


public class VehicleTest1 {
	public static void main(String[] args) {
	    Car car1 = new Car("Camley", "Toyota", "Suzuki", "Gasoline", 5); 
            Car car2 = new Car();
            car2.setModelName("Aqua");
            car2.setCompany("Toyota");
            car2.setOwner("Nakajima");
            car2.setEngineType("Hybrid");
	System.out.println("Car1 => " + car1);
        System.out.println("Car2 => ");
	System.out.println("Model: " + car2.getModelName());
	System.out.println("Company: " + car2.getCompany());
	System.out.println("Owner: " + car2.getOwner());
	System.out.println("Engine Type: " + car2.getEngineType());

	}  // end of main 
}


