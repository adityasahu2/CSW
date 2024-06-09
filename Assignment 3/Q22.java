//Create a custom checked exception class named CustomCheckedException. Use this exception in your program to handle a specific error condition and demonstrate its usage using try-catch block.
import java.util.Scanner;
class CustomCheckedException extends Exception{
  public CustomCheckedException(String message){
    super(message);
  }
}
public class Q22{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      if(x < 0) throw new CustomCheckedException("Negative number");
      System.out.println("Entered number : "+x);
    }
    catch(CustomCheckedException e){System.out.println(e.getMessage());}
  }
}