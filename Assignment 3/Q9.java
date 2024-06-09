//Create a program that divides two numbers input by the user. Handle the possibility of division by zero using try-catch block to catch ArithmeticException.
import java.util.Scanner;
public class Q9{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.print("Enter another number : ");
      int y = ob.nextInt();
      System.out.println(x/y);
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}