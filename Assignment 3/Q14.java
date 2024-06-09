//Implement a Java application that computes the value of the expression log(abs(sin(x) + cos(x))) / (tan(x) - cot(x)) for a given value of x. Ensure proper error handling for potential arithmetic exceptions and negative values inside the logarithmic function.
import java.util.Scanner;
public class Q14{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println((Math.log(Math.abs(Math.sin(x) + Math.cos(x))) / (Math.tan(x) - (1/Math.tan(x)))));
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}