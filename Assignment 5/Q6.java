// Case Conversion and Comparison: Prompt the user to input two strings. Convert both strings to lowercase and uppercase. Compare the converted strings to check case-insensitive equality. Display the converted strings and the result of the comparison.
import java.util.Scanner;
public class Q6 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the first string : ");
    String a = ob.nextLine();
    System.out.print("Enter the second string : ");
    String b = ob.nextLine();
    String aL = a.toLowerCase();
    String bL = b.toLowerCase();
    String aU = a.toUpperCase();
    String bU = b.toUpperCase();
    boolean equal = aL.equals(bL);
    System.out.println("\nConverted Strings : ");
    System.out.println("First String Lowercase : " + aL);
    System.out.println("First String Uppercase : " + aU);
    System.out.println("Second String Lowercase : " + bL);
    System.out.println("Second String Uppercase : " + bU);
    System.out.print("\nComparison Result : ");
    if (equal) System.out.println("The two strings are equal (case-insensitive comparison)");
    else System.out.println("The two strings are not equal"); 
  }
}