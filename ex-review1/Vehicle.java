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
}
