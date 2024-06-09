//Write a memory-intensive program which creates a lot of objects. Try G1 collector on this program. Print timestamp and heap size. Use the following commands to print the heap size and free space.
// Command to print total memory of heap:
// Runtime.getRuntime().totalMemory();
// Command to print free memory of heap:
// Runtime.getRuntime().freeMemory();
import java.util.ArrayList;
import java.util.Date;
public class Q6 {
  public static void main(String[] args) {
    ArrayList<Object> objects = new ArrayList();
    Runtime runtime = Runtime.getRuntime();
    System.out.println("Timestamp\tTotal Memory\tFree Memory");
    for (int i = 0; i < 1000000; i++) {
      objects.add(new Object());
      if (i % 10000 == 0) {
        long timestamp = new Date().getTime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        System.out.println(timestamp + "  " + totalMemory + "  " + freeMemory);
      }
    }
    objects.clear();
    System.gc();
  }
}