//Implement a method that reads an integer from the user but handles InputMismatchException using try-catch block.
import java.util.InputMismatchException;
import java.util.Scanner;
public class Q25{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      System.out.println("Entered number : "+x);
    }
    catch(InputMismatchException e){System.out.println("Enter a Number");}
  }
}