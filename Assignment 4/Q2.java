//Develop a Java program showcasing reference reassignment and garbage collection using the ReassigningReference class. This class features a constructor initializing an object with a given name. In the main() method, two instances of ReassigningReference are created. Then, the reference is reassigned. Subsequently, the garbage collector is explicitly invoked. Additionally, the program overrides the finalize() method to print the name of the object upon successful garbage collection.
class ReassigningReference{
  String name;
  ReassigningReference(String name) {this.name = name;}
  public void finalize() {System.out.println("Object "+name+" is garbage collected");}
}
public class Q2{
  public static void main(String[] args){
    ReassigningReference obj1 = new ReassigningReference("Aditya");
    ReassigningReference obj2 = new ReassigningReference("Aditya");
    obj1 = obj2;
    System.gc();
  }
}