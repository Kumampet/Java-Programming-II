abstract class Vehicle {
  protected String modelName;
  protected String company;
  protected String owner;
  protected String engineType;
  protected double tankSize;
  protected double fuelConsumption;

  Vehicle(String m, String c, String o, String e, double t, double f) {
    modelName = m;
    company = c;
    owner = o;
    engineType = e;
    tankSize = t;
    fuelConsumption = f;
  }
  public String toString() {
    return new String("ModelName: " + modelName + ", Company: " + company + ", Owner: " + owner + ", EngineType: "
    + engineType + ", TankSize: " + tankSize + ", FuelConsumption: " + fuelConsumption);
  }
  public double movableDistance() {
    return tankSize * fuelConsumption;
  }
  abstract public double costFor100Km(PetroleumPrice p);
  abstract public void setAirConON();
  abstract public void setAirConOFF();
}

//------------------------------Car------------------------------------------
class Car extends Vehicle {
  protected int numberOfSeat;
  protected boolean airConditionOn = false;

  public Car(String m, String c, String o, String e, double t, double f, int n) {
    super(m, c, o, e, t, f);
    numberOfSeat = n;
  }
  public String toString() {
    return super.toString() + ", NumberOfSeat: " + numberOfSeat;
  }
  public void setAirConON() {
    if(airConditionOn == false) {
      fuelConsumption = fuelConsumption * 0.85;
      airConditionOn = true;
    }
  }
  public void setAirConOFF()  {
    if(airConditionOn == true) {
      airConditionOn = false;
    }
  }
  public double costFor100Km(PetroleumPrice pprice) {
    return 100. * pprice.getGasolineCost() / fuelConsumption;
  }
}
//-------------------------MiniVan------------------------------------------
class MiniVan extends Vehicle {
  protected int numberOfSeat;
  protected boolean airConditionOn = false;
  protected boolean setHasAutoDoor;

  public MiniVan(String m, String c, String o, String e, double t, double f, int n, boolean d) {
    super(m, c, o, e, t, f);
    numberOfSeat = n;
    setHasAutoDoor = d;
  }
  public String toString() {
    return super.toString() + ", NumberOfSeat: " + numberOfSeat + ", SetHasAutoDoor: " + setHasAutoDoor;
  }
  public void setAirConON() {
    if(airConditionOn == false) {
      fuelConsumption = fuelConsumption * 0.75;
      airConditionOn = true;
    }
  }
  public void setAirConOFF()  {
    if(airConditionOn == true) {
      airConditionOn = false;
    }
  }
  public double costFor100Km(PetroleumPrice pprice) {
    return 100. * pprice.getGasolineCost() / fuelConsumption;
  }
}

//-----------------------Truck-------------------------------------
class Truck extends Vehicle {
  protected int numberOfSeat;
  protected boolean airConditionOn = false;
  protected int power;

  public Truck(String m, String c, String o, String e, double t, double f, int n, int p) {
    super(m, c, o, e, t, f);
    numberOfSeat = n;
    power = p;
  }
  public String toString() {
    return super.toString() + ", NumberOfSeat: " + numberOfSeat + ", EnginePower: " + power;
  }
  public void setAirConON() {
    if(airConditionOn == false) {
      fuelConsumption = fuelConsumption * 0.75;
      airConditionOn = true;
    }
  }
  public void setAirConOFF()  {
    if(airConditionOn == true) {
      airConditionOn = false;
    }
  }
  public double costFor100Km(PetroleumPrice pprice) {
    return 100. * pprice.getGasolineCost() / fuelConsumption;
  }
}

//-------------------------ガソリン単価--------------------------------------------
class PetroleumPrice {
  private double gasolinePrice;
  private double dieselPrise;
  PetroleumPrice(double g, double d) {
    gasolinePrice = g;
    dieselPrise = d;
  }
  public double getGasolineCost() {
    return gasolinePrice;
  }
  public double getDieselCost() {
    return dieselPrise;
  }
}

//-----------------------------Main-------------------------------------
public class VehicleTest {
  public static void describe(Vehicle v) {
    System.out.println(v);
  }
  public static void main(String[] args) {
    Vehicle vehicles[] = {
      new Car("Camley", "Toyota", "Suzuki", "Gasoline", 70., 15.15, 5),
      new Car("Aqua", "Toyota", "Nakajima", "Hybrid", 36., 40.0, 5),
      new MiniVan("Sienna", "Toyota", "Tanaka", "Gasoline", 75.,  9.0, 8, true),
      new MiniVan("Odyssey", "Honda", "Kikuchi", "Diesel", 56., 11.0, 8, false),
      new MiniVan("Presage", "Nissan", "Shirotora", "Gasoline", 60., 7.0, 7, false),
      new Truck("Tundra", "Toyota", "Sugai", "Diesel", 100., 6.76, 5, 310),
      new Truck("Ridgeline", "Honda", "Watanabe", "Diesel", 83.279, 7.23, 5, 250)
    };

    PetroleumPrice priceInfo = new PetroleumPrice(143., 99.4);

    for(Vehicle v: vehicles) {
      describe(v);
      System.out.println("Movable distance: " + v.movableDistance() + " Km");
      System.out.println("Cost for 100 Km: " + v.costFor100Km(priceInfo) + " Yen");
      System.out.println();
    }
    System.out.println();
    System.out.println("After Aircondition is ON\n");
    for(Vehicle v: vehicles) {
      v.setAirConON();
      describe(v);
      System.out.println("Movable distance: " + v.movableDistance() + " Km");
      System.out.println("Cost for 100 Km: " + v.costFor100Km(priceInfo) + " Yen");
      System.out.println();
    }
  }  // end of main
}
