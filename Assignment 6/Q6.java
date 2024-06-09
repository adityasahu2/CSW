//6.	Delete a Specific File: Write a Java program where the user can enter the name of a file to be deleted from the system. The program should check if the file exists and delete it, providing a confirmation message upon successful deletion or an error message if the file does not exist.
import java.io.*;
import java.util.*;
public class Q6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter file name : ");
    String fileName = sc.nextLine();
    File file = new File(fileName);
    if(file.exists()){
      if(file.delete()){
        System.out.println("File deleted");
      }
      else{
        System.out.println("Error deleting file");
      }
    }
    else{
      System.out.println("File not found");
    }
  }
}