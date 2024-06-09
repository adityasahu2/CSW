//Write a Java program illustrating nullification of references and garbage collection using the NullifiedReference class. This class comprises a constructor initializing an object with a provided name. Within the main() method, an instance of NullifiedReference is created and assigned, followed by a nullification of the object reference. Subsequently, the garbage collector is explicitly invoked. Furthermore, the program overrides the finalize() method to print the name of the object upon successful garbage collection.
class NullifiedReference{
  String name;
  NullifiedReference(String name) {this.name = name;}
  public void finalize() {System.out.println("Object "+name+" is garbage collected");}
}
public class Q3{
  public static void main(String[] args){
    NullifiedReference obj = new NullifiedReference("Aditya");
    obj = null;
    System.gc();
  }
}