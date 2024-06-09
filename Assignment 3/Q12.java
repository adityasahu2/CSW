//Create a Java application that calculates the value of the expression sqrt(abs(sin(x) * cos(x))) / (tan(x) + 1) for a given value of x. Handle cases where x leads to division by zero or negative values inside the square root function.
import java.util.Scanner;
public class Q12{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println(Math.sqrt(Math.abs(Math.sin(x) * Math.cos(x))) / (Math.tan(x) + 1));
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}