import java.util.ArrayList;

class ToyBox<T> {
  private ArrayList<T> array = new ArrayList<T>();
  public void add(T t) {
    array.add(t);
  }
  public T get(int i) {
    return array.get(i);
  }
  public int getSize() {
    return array.size();
  }
}

public class ToyBoxTest {
  public static void showToysinBox(Toy<? extends > c/* Parameter with bounded wildcard to accept Toy and its subclasses*/) {
    // Complete showAnimalsinToyBox method with proper argument and method body
    int num = c.getSize();
    for(int i=0; i<num; i++){
        System.out.println(c.get(i));
    }
  }
  public static void main(String[] args) {
    ArrayList<Car> carBox = new ArrayList<Car>();
    Car t1 = new Car("Yaris", 1500);
    Car t2 = new Car("Corolla", 2500);
    carBox.add(t1);
    carBox.add(t2);
    showToysinBox(carBox);

    ArrayList<Bear> bearBox = new ArrayList<Bear>();
    Bear b1 = new Bear("Bear1", 1000);
    Bear b2 = new Bear("Bear2", 2000);
    bearBox.add(b1);
    bearBox.add(b2);
    showToysinBox(bearBox);
    /* It is OK till now */
    // Next, create Box<Toy>
    // Create a "toyBox" with proper sentence
    ArrayList<Toy> toyBox = new ArrayList<Toy>();
    Car t3 = new Car("Tacoma", 3300);
    Bear b3 = new Bear("Bear3", 1200);
    toyBox.add(t3);
    toyBox.add(b3);
    showToysinBox(toyBox);
    /* It is still OK till now */
    // How about the next? Is it subtype?
    ToyBox<? extends Car> sometoyBox = carBox;
    System.out.println("After assigning the carBox into the \"sometoyBox\"...");
    showToysinBox(sometoyBox);
  }
}

class Toy {
  // Complete Toy Class
  private String name;
  private int value;
  Toy(String n, int v){
    name = n;
    value = v;
  }
  public String toString(){
    return new String(name + "/" + value);
  }
}
class Car extends Toy{
  public Car(String n, int v){
    super(n,v);
  }
}
class Bear extends Toy{
  public Bear(String n, int v){
    super(n,v);
  }
}

// Car class and Bear class to extend the Toy class
