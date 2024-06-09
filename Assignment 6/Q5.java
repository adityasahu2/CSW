//5.	Filter and List Specific File Types: Create a Java application that lists all the ".txt" files in a given directory. The program should prompt the user for the directory path and then display a list of all text files found in that directory.
import java.io.*;
import java.util.*;
public class Q5{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter directory path : ");
    String path = sc.nextLine();
    File file = new File(path);
    if(file.exists()){
      if(file.isDirectory()){
        File[] files = file.listFiles();
        for(File f : files){
          if(f.getName().endsWith(".txt")){
            System.out.println(f.getName());
          }
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