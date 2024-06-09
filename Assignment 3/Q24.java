//Write a Java program to demonstrate a checked exception (e.g., FileNotFoundException) being thrown and caught using try-catch block
import java.io.File;
import java.io.FileNotFoundException;
public class Q24{
  public static void main(String[] args){
    try{
      File file = new File("data.txt");
      if(!file.exists()){
        throw new FileNotFoundException("File not found");
      }
      System.out.println("File found");
    }
    catch(FileNotFoundException e){System.out.println(e.getMessage());}
  }
}