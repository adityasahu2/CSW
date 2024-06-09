//Develop a Java class containing private data members of integer and double types, along with methods for initializing, setting, and updating these data members. Create two objects of this class, each calling the necessary methods to set or update the data members. Utilize the Runtime class to calculate the total memory allocated and the memory occupied by the objects. Employ any technique to make objects unreachable, hence eligible for garbage collection. Finally, recheck the utilized and total memory using the Runtime class.
class Test {
  private int a;
  private double b;
  Test(){
    this.a = 0;
    this.b = 0.0;
  }
  public void setValues(int a, double b) {
    this.a = a;
    this.b = b;
  }
  public void updateValues(int a, double b) {
    this.a += a;
    this.b += b;
  }
}
public class Q5{
  public static void main(String[] args) {
    Test obj1 = new Test();
    Test obj2 = new Test();
    obj1.setValues(10, 3.5);
    obj2.setValues(20, 5.8);
    obj1.updateValues(5, 2.1);
    obj2.updateValues(8, 1.4);
    Runtime runtime = Runtime.getRuntime();
    long totalMemoryBefore = runtime.totalMemory();
    long freeMemoryBefore = runtime.freeMemory();
    System.out.println("Total memory before: " + totalMemoryBefore);
    System.out.println("Free memory before: " + freeMemoryBefore);
    obj1 = null;
    obj2 = null;
    System.gc();
    long totalMemoryAfter = runtime.totalMemory();
    long freeMemoryAfter = runtime.freeMemory();
    System.out.println("Total memory after: " + totalMemoryAfter);
    System.out.println("Free memory after: " + freeMemoryAfter);
  }
}
