//Interactive String Explorer: Prompt the user for a string. Display a menu with options to perform various operations: convert to lowercase/uppercase, search for a character/index, or concatenate with another string. Based on user selection, perform the appropriate string operation and show the result.
import java.util.Scanner;
public class Q10 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str = ob.nextLine();
    int choice;
    while(true) {
      System.out.print("\nString Explorer Menu :\n1. Convert to lowercase\n2. Convert to uppercase\n3. Search for a character\n4. Get character at index\n5. Concatenate with another string\n0. Exit\nEnter your choice : ");
      choice = ob.nextInt();
      ob.nextLine();
      switch (choice) {
        case 1:
          System.out.println("Result : " + str.toLowerCase());
          break;
        case 2:
          System.out.println("Result : " + str.toUpperCase());
          break;
        case 3:
          System.out.print("Enter a character to search for : ");
          char Char = ob.nextLine().charAt(0);
          if (str.contains(String.valueOf(Char))) System.out.println("Character '" + Char + "' found in the string");
          else System.out.println("Character '" + Char + "' not found in the string");
          break;
        case 4:
          System.out.print("Enter an index to get the character : ");
          int index = ob.nextInt();
          if (index >= 0 && index < str.length()) System.out.println("Character at index " + index + " : " + str.charAt(index));
          else System.out.println("Invalid index");
          break;
        case 5:
          System.out.print("Enter another string to concatenate : ");
          String concat = ob.nextLine();
          System.out.println("Result : " + str.concat(concat));
          break;
        case 0:
          System.out.println("Exiting program");
          System.exit(0);
        default:
          System.out.println("Invalid choice");
      }
    } 
  }
}
