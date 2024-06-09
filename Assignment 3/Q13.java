//Design a Java program that evaluates the value of the function (sin(x) * cos(x)) / (sin(x) + cos(x)) for a given value of x. Handle potential arithmetic exceptions that may arise due to invalid mathematical operations.
import java.util.Scanner;
public class Q13{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println((Math.sin(x) * Math.cos(x)) / (Math.sin(x) + Math.cos(x)));
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}