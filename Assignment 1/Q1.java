// Write a Java code snippet that comprises a Car class and a CarTester class. The Car class should define private fields for make and model, along with a parameterized constructor and getter/setter methods for these attributes. In the CarTester class, instantiate two instances of the Car class: myCar1 with a specified make and model, and myCar2 with null values. After instantiation, the CarTester class should retrieve and print the initial make and model of both cars. Then, it should set new values for myCar2 using setter methods and print the updated make and model.

class Car {
  private String make,model;
  
  public Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  public String getMake() {return this.make;}
  public String getModel() {return this.model;}
  public void setMake(String make) {this.make = make;}
  public void setModel(String model) {this.model = model;}
}
class Q1 { //CarTester
  public static void main(String[] args) {
    Car myCar1 = new Car("Toyota", "Camry");
    Car myCar2 = new Car(null, null);

    System.out.println("Initial make: " + myCar1.getMake() + ", Initial model: " + myCar1.getModel());
    System.out.println("Initial make: " + myCar2.getMake() + ", Initial model: " + myCar2.getModel());

    myCar2.setMake("Honda");
    myCar2.setModel("Accord");

    System.out.println("Updated make: " + myCar2.getMake() + ", Updated model: " + myCar2.getModel());
  }
}