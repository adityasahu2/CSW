//Write a Java program that illustrates the difference between using string literals and the new keyword for creating String objects. Your program should demonstrate the memory usage implications and how string comparison behaves differently in each case.
public class Q1{
  public static void main(String [] Args){
    String s1 = "Aditya";
    String s2 = new String("Aditya");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));
  }
}