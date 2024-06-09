 //Develop a recursive algorithm implemented in Java that traverses or manipulates arrays. Introduce scenarios where the recursion reaches beyond the bounds of the array, resulting in ArrayIndexOutOfBoundsException. Your task is to handle these exceptions within the recursive algorithm and ensure proper termination of recursion.
import java.util.Scanner;
public class Q18{
  public static int arraySum(int[] arr, int index) {
    if(index == 0) return arr[0];
    return arr[index] + arraySum(arr, index - 1);
  }
  public static void main(String[] args) {
    try {
      int[] arr = {1, 2, 3, 4, 5};
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      int sum = arraySum(arr, x);
      System.out.println("Sum of elements: " + sum);
    } 
    catch (ArrayIndexOutOfBoundsException e) {System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());}
  }
}