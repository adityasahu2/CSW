//Create and Write to a File: Write a Java program that prompts the user for a diary entry, then creates a file named "diary.txt" and writes the current date followed by the user's entry into this file. Ensure the program checks if the file already exists and informs the user, to avoid overwriting any previous content.
import java.util.*;
import java.io.*;
import java.time.*;
public class Q1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your diary entry : ");
    String entry = sc.nextLine();
    LocalDate date = LocalDate.now();
    System.out.println(date);
    File file = new File("diary.txt");
    if(file.exists()){
      System.out.println("File already exists");
    }
    else{
      try{
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        fw.write(date + "\n" + entry);
        fw.close();
      }
      catch(IOException e){
        System.out.println("Error writing to file");
      }
    }
  }
}