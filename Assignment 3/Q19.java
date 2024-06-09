//Implement a Java program that performs complex manipulations on an array of integers. The program should involve operations such as sorting, searching, and accessing elements at various indices. Introduce scenarios, where accessing elements beyond the bounds of the array leads to ArrayIndexOutOfBoundsException. Your task is to handle these exceptions gracefully and ensure the program continues execution without crashing.
import java.util.*;
public class Q19{
  public static void main(String[] args){
    try{
      int[] arr = {5, 2, 4, 1, 3};
      sort(arr);
      System.out.println(Arrays.toString(arr));
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      x = search(arr, x);
      if(x < 0) System.out.println("Element not found");
      else System.out.println("Element found at index : "+x);
      System.out.print("Enter a number : ");
      x = ob.nextInt();
      System.out.println(arr[x]);
    }
    catch(ArrayIndexOutOfBoundsException e){System.out.println("Array Index Out Of Bounds Exception : "+e.getMessage());}
  }
  public static void sort(int[] arr){Arrays.sort(arr);}
  public static int search(int[] arr, int x){return Arrays.binarySearch(arr, x);}
}