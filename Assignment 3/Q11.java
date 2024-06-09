//Write a Java program that computes the value of the function log(sin(x) + cos(x)) / (tan(x) - cot(x)) for a given value of x. Ensure proper handling of exceptions that may occur due to invalid mathematical operations.
import java.util.Scanner;
public class Q11{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println((Math.log(Math.sin(x) + Math.cos(x)) / (Math.tan(x) - (1/Math.tan(x)))));
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}