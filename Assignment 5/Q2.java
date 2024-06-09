// Write a Java program that demonstrates the immutability of the String class and how it implements the CharSequence interface. Your program should illustrate the behaviours that highlight String immutability and its usage as a CharSequence.
public class Q2 {
  public static void main(String[] args) {
    String s = "Aditya";
    System.out.println(s);
    s = s.concat(" Sahu");
    System.out.println(s);
    System.out.println(s.charAt(0));
    System.out.println(s.length());
    System.out.println(s.substring(0, 5));
  }
}