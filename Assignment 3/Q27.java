//Write a program to handle ClassCastException
public class Q27 {
  public static void main(String[] args) {
    try {
      Object obj = 123;
      String str = (String) obj; 
      System.out.println("String value: " + str); 
    } 
    catch (ClassCastException e) {System.out.println("Class Cast Exception : " + e.getMessage());}
  }
}