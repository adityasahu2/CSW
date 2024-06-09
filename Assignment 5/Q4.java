//  Create a Java program that uses StringBuilder to perform a series of text manipulations on a user-provided string. The program should allow users to:
//         a. Add a substring at a specified position.
//         b. Remove a range of characters from the string.
//         c. Modify a character at a specified index.
//         d. Concatenate another string at the end.
//         e. Display the current string after each operation.
// The program should repeatedly prompt the user to choose an operation until they decide to exit. After each operation, it should display the modified string, demonstrating the mutable nature of StringBuilder.
import java.util.Scanner;
public class Q4 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    System.out.print("Enter an initial string : ");
    sb.append(ob.nextLine());
    int option;
    while(true) {
      System.out.println("\nChoose an operation : ");
      System.out.println("1. Add a substring at a specified position");
      System.out.println("2. Remove a range of characters");
      System.out.println("3. Modify a character at a specified index");
      System.out.println("4. Concatenate another string at the end");
      System.out.println("5. Display the current string");
      System.out.println("0. Exit");
      System.out.print("Enter your choice : ");
      option = ob.nextInt();
      ob.nextLine();
      switch (option) {
        case 1:
          System.out.print("Enter the substring to add : ");
          String str = ob.nextLine();
          System.out.print("Enter the position index : ");
          int index = ob.nextInt();
          sb.insert(index, str);
          break;
        case 2:
          System.out.print("Enter the start index : ");
          int start = ob.nextInt();
          System.out.print("Enter the end index : ");
          int end = ob.nextInt();
          sb.delete(start, end);
          break;
        case 3:
          System.out.print("Enter the character to insert : ");
          char newChar = ob.nextLine().charAt(0);
          System.out.print("Enter the index to modify : ");
          index = ob.nextInt();
          if (index < sb.length()) {sb.setCharAt(index, newChar);}
          break;
        case 4:
          System.out.print("Enter the string to concatenate : ");
          str = ob.nextLine();
          sb.append(str);
          break;
        case 5:
          System.out.println("Current string : " + sb);
          continue;
        case 0:
          System.out.println("Exiting program");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid option. Please try again");
      }
      System.out.println("Current string : " + sb);
    }
  }
}