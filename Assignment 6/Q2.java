//2.	Read from a File: Write a Java application that opens the "diary.txt" file created in the previous question and displays its content on the console. The program should handle cases where the file does not exist by displaying an appropriate error message.

import java.io.*;
public class Q2{
  public static void main(String[] args){
    File file = new File("diary.txt");
    if(file.exists()){
      try{
        FileReader fr = new FileReader(file);
        
      }
    }
    else{
      System.out.println("File not found");
    }
  }
}