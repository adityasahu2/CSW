//4.	List Files and Directories: Write a program in Java that asks the user for a directory path and then lists all files and subdirectories in that directory. If the directory does not exist, the program should inform the user.
import java.io.*;
import java.util.*;
public class Q4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter directory path : ");
    String path = sc.nextLine();
    File file = new File(path);
    if(file.exists()){
      if(file.isDirectory()){
        File[] files = file.listFiles();
        for(File f : files){
          System.out.println(f.getName());
        }
      }
      else{
        System.out.println("Not a directory");
      }
    }
    else{
      System.out.println("Directory not found");
    }
  }
}