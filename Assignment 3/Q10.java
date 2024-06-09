//Implement a Java program that calculates the value of the expression (sin(x) + cos(x)) / tan(x) for a given value of x. Handle scenarios where x is close to multiples of π/2 to avoid division by zero errors
import java.util.Scanner;
public class Q10{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println((Math.sin(x) + Math.cos(x)) / Math.tan(x));
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}