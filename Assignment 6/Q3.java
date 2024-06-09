//3.	Append Content to an Existing File: Write a Java program that adds a new diary entry to the "diary.txt" file without overwriting its existing content. The program should ask the user for the new entry and append it to the file along with a timestamp
import java.util.*;
import java.io.*;
import java.time.*;
public class Q3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your diary entry : ");
    String entry = sc.nextLine();
    LocalDate date = LocalDate.now();
    System.out.println(date);
    File file = new File("diary.txt");
    if(file.exists()){
      try{
        FileWriter fw = new FileWriter(file, true);
        fw.write(date + "\n" + entry);
        fw.close();
      }
      catch(IOException e){
        System.out.println("Error writing to file");
      }
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