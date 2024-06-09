// Write a Java code snippet comprising two classes: Laptop and Main. The Laptop class defines private fields model and price, alongside setter methods for each attribute. Additionally, it overrides the toString() method to return a string representation of the laptop's model and price. In the Main class, create an instance of Laptop, setting its model using the  setter method. Then, print the laptop object using the toString() method. Describe the functionality of the toString() method in the Laptop class and explain how it is utilized in the Main class. 

 class Laptop{
  private String model;
  private int price;
  public String getModel(){return this.model;}
  public int getPrice(){return this.price;}
  public void setModel(String model){this.model = model;}
  public void setPrice(int price){this.price = price;}
  public String toString(){return "Model: "+this.model+", Price: "+this.price;}
}
public class Q4{
  public static void main(String[] args){
    Laptop L = new Laptop();
    L.setModel("Macbook");
    L.setPrice(100000);
    System.out.println(L);
  }
}