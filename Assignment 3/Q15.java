//Demonstration of use nested try-catch block. Write a Java program to handle NumberFormatException in outer try-catch block and ArithmeticException inside the inner try-catch block.
import java.util.Scanner;
public class Q15{
  public static void main(String[] args){
    try{
      try{
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = Integer.parseInt(ob.nextLine());
        System.out.println((Math.log(Math.abs(Math.sin(x) + Math.cos(x))) / (Math.tan(x) - (1/Math.tan(x))))); 
      }
      catch(NumberFormatException e){System.out.println("Number Format Exception : "+e.getMessage());}
    }
    catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
  }
}