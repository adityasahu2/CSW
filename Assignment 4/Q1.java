//Write a Java program illustrating garbage collection through an UnreachableObject class. This class will include a constructor initializing an object with a given name, a show() method creating an instance of UnreachableObject class and then invoking display(), a display() method creating an UnreachableObject instance, and a main() method calling show() followed by an explicit invocation of the garbage collector. Additionally, the program will override the finalize() method to print the object's name upon successful garbage collection
class UnreachableObject{
  String name;
  UnreachableObject(String name) {this.name = name;}
  void show(){
    UnreachableObject obj = new UnreachableObject(name);
    obj.display();
  }
  void display(){
    UnreachableObject obj = new UnreachableObject(name);
    System.out.println(obj.name);
  }
  public void finalize() {System.out.println("Object "+name+" is garbage collected");}
}
public class Q1{
  public static void main(String[] args){
    UnreachableObject obj = new UnreachableObject("Aditya");
    obj.show();
    System.gc();
  }
}