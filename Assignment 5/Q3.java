// Write a Java program that uses StringBuffer to construct a simple text editor which can perform the following operations:
//         a. Append a given string to the existing text.
//         b. Insert a given string at a specified index within the existing text.
//         c. Delete a portion of text between two specified indices.
//         d. Reverse the entire text.
//         e. Replace a portion of the text between two specified indices with a given string.
// Your program should display a menu with options to perform each of the above operations. After each operation, print the current state of the text. Also, display the current capacity and length of the StringBuffer after each operation to showcase its dynamic nature.

import java.util.Scanner;
public class Q3 {
    public static void main (String [] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("****MENU***");
      System.out.println("Press 1 for Append");
      System.out.println("Press 2 for Insert");
      System.out.println("Press 3 for Delete");
      System.out.println("Press 4 for Reverse");
      System.out.println("Press 5 for Replace");
      System.out.println("Press 0 for Exit");
      System.out.println("Enter your choice: ");
      int choice = sc.nextInt();
      StringBuffer sb = new StringBuffer("Namaste");
      switch (choice) {
        case 0:System.exit(0);
        case 1:sb.append(" World");System.out.println(sb);break;
        case 2:sb.insert(7, " Java");System.out.println(sb);break;
        case 3:sb.delete(0, 8);System.out.println(sb);break;
        case 4:sb.reverse();System.out.println(sb);break;
        case 5:sb.replace(0, 5, "Hi");System.out.println(sb);break;
        default:System.out.println("Invalid input");break;
      }sc.close();
    }
}

// import java.util.Scanner;

// public class Q3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         StringBuffer text = new StringBuffer();

//         while (true) {
//             System.out.println("\nSimple Text Editor");
//             System.out.println("1. Append text");
//             System.out.println("2. Insert text");
//             System.out.println("3. Delete text");
//             System.out.println("4. Reverse text");
//             System.out.println("5. Replace text");
//             System.out.println("6. Exit");
//             System.out.print("Choose an option: ");

//             int choice = scanner.nextInt();
//             scanner.nextLine(); 

//             switch (choice) {
//                 case 1: 
//                     System.out.print("Enter text to append: ");
//                     String toAppend = scanner.nextLine();
//                     text.append(toAppend);
//                     break;
//                 case 2: 
//                     System.out.print("Enter position to insert text: ");
//                     int insertPos = scanner.nextInt();
//                     scanner.nextLine(); 
//                     System.out.print("Enter text to insert: ");
//                     String toInsert = scanner.nextLine();
//                     if (insertPos >= 0 && insertPos <= text.length()) {
//                         text.insert(insertPos, toInsert);
//                     } else {
//                         System.out.println("Invalid position.");
//                         continue;
//                     }
//                     break;
//                 case 3: 
//                     System.out.print("Enter start index: ");
//                     int startIndex = scanner.nextInt();
//                     System.out.print("Enter end index: ");
//                     int endIndex = scanner.nextInt();
//                     if (startIndex >= 0 && endIndex <= text.length() && startIndex < endIndex) {
//                         text.delete(startIndex, endIndex);
//                     } else {
//                         System.out.println("Invalid indices.");
//                         continue;
//                     }
//                     break;
//                 case 4: 
//                     text.reverse();
//                     break;
//                 case 5: 
//                     System.out.print("Enter start index for replace: ");
//                     int startReplace = scanner.nextInt();
//                     System.out.print("Enter end index for replace: ");
//                     int endReplace = scanner.nextInt();
//                     scanner.nextLine(); 
//                     System.out.print("Enter replacement text: ");
//                     String replacement = scanner.nextLine();
//                     if (startReplace >= 0 && endReplace <= text.length() && startReplace < endReplace) {
//                         text.replace(startReplace, endReplace, replacement);
//                     } else {
//                         System.out.println("Invalid indices.");
//                         continue;
//                     }
//                     break;
//                 case 6: 
//                     System.out.println("Exiting program.");
//                     System.exit(0);
//                     break;
//                 default:
//                     System.out.println("Invalid option. Please choose again.");
//                     continue;
//             }
//             System.out.println("Current text: " + text);
//             System.out.println("Current length: " + text.length());
//             System.out.println("Current capacity: " + text.capacity());
//         }
//     }
// }
