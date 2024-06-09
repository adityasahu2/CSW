// Character Array and Search: Ask for a string from the user. Convert the string to a character array. Prompt the user to enter a character to search in the string. Find the first and last occurrences of the character. Display the character array and the positions found (if any).

import java.util.Scanner;
public class Q7 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = ob.nextLine();
    char[] Arr = str.toCharArray();
    System.out.print("Enter a character to search for : ");
    char Char = ob.next().charAt(0); 
    int first = -1;
    int last = -1;
    for (int i = 0; i < Arr.length; i++) 
      if (Arr[i] == Char) {
        if (first == -1) first = i;
        last = i;
      }
    System.out.print("Character Array : ");
    for (char c : Arr) System.out.print(c + " ");
    System.out.println(); 
    if (first != -1) {
      System.out.println("First occurrence of '" + Char + "' is at index : " + first);
      System.out.println("Last occurrence of '" + Char + "' is at index : " + last);
    } else System.out.println("Character '" + Char + "' not found.");
  }
}
