//Write a program that reads data from a file and performs some processing. Handle checked IOException by using try-catch block to catch and handle the exception.
import java.util.Scanner;
import java.io.File;
public class Q23{
  public static void main(String[] args){
    try{
      Scanner ob = new Scanner(new File("data.txt"));
      while(ob.hasNext()){
        System.out.println(ob.nextLine());
      }
    }
    catch(Exception e){System.out.println(e.getMessage());}
  }
}