// Word Replacement in Sentences: Request a sentence and two words from the user: one to search for and one to replace it with. Find the first occurrence of the search word in the sentence. Replace the word using substring operations and concatenation. Display the original and the modified sentences.

import java.util.Scanner;
public class Q9 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter a sentence : ");
    String str = ob.nextLine();
    System.out.print("Enter the word to search for : ");
    String search = ob.nextLine();
    System.out.print("Enter the word to replace it with : ");
    String replace = ob.nextLine();
    int index = str.indexOf(search);
    if (index != -1) {
      String modified = str.substring(0, index) + replace + str.substring(index + search.length());
      System.out.println("\nOriginal Sentence: " + str);
      System.out.println("Modified Sentence: " + modified);
    } else System.out.println("\nThe search word was not found in the sentence.");
  }
}
