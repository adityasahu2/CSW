//Create a Java program to handle ArrayIndexOutOfBoundsException
import java.util.Scanner;
public class Q16{
  public static void main(String[] args){
    try{
      int[] arr = {1, 2, 3, 4, 5};
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println(arr[x]);
    }
    catch(ArrayIndexOutOfBoundsException e){System.out.println("Array Index Out Of Bounds Exception : "+e.getMessage());}
  }
}