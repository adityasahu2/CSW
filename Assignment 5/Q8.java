// String Concatenation and Character Retrieval: Take two strings from the user. Concatenate them using the string method and the + operator, then display both results. Ask the user for an index number, then display the character at that index.

import java.util.Scanner;
public class Q8 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the first string : ");
    String first = ob.nextLine();
    System.out.print("Enter the second string : ");
    String second = ob.nextLine();
    String concat = first.concat(second);
    System.out.println("Concatenated with concat() : " + concat);
    String plus = first + second;
    System.out.println("Concatenated with + : " + plus);
    System.out.print("Enter an index : ");
    int index = ob.nextInt();
    try {
      char Char = plus.charAt(index);
      System.out.println("Character at index " + index + " : " + Char);
    } catch (StringIndexOutOfBoundsException e) {System.out.println("String Index Out Of Bounds Exception : "+e.getMessage());}
  }
}
