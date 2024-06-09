//Create a Java program demonstrating anonymous objects and garbage collection with the AnonymousObject class. It includes a constructor initializing an object with a name. In main(), an anonymous object is created, and the garbage collector is invoked. The finalize() method prints the object's name upon successful garbage collection. 
class AnonymousObject{
  String name;
  AnonymousObject(String name) {this.name = name;}
  public void finalize() {System.out.println("Object "+name+" is garbage collected");}
}
public class Q4{
  public static void main(String[] args){
    AnonymousObject obj = new AnonymousObject("Aditya");
    System.gc();
  }
}