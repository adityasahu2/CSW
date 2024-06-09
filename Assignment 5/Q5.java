// Create a Java program that compares the performance of StringBuilder and StringBuffer when performing repeated string concatenations. The program should:
//         a. Prompt the user to enter a base string and the number of times it should be concatenated to itself.
//         b. Use StringBuilder to concatenate the string the specified number of times, tracking the time taken to complete the operation.
//         c. Repeat the process using StringBuffer, again tracking the time taken.
//         d. Output the time taken for each operation and the final length of the resulting strings to demonstrate both the time efficiency and the result of using StringBuilder and StringBuffer.

// Example output of the program could look like this:
// Enter the base string:
// > Hello
// Enter the number of concatenations:
// > 10000
//   Using StringBuilder...
//   Time taken: 5 milliseconds
//   Final string length: 50000
//   Using StringBuffer...
//   Time taken: 6 milliseconds
//   Final string length: 50000
//   Comparison: StringBuilder was faster than StringBuffer by 1 millisecond.
import java.util.Scanner;
public class Q5 {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter the base string : ");
    String str = ob.nextLine();
    System.out.print("Enter the number of concatenations : ");
    int num = ob.nextInt();

    long start = System.currentTimeMillis();
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < num; i++) {stringBuilder.append(str);}
    long end = System.currentTimeMillis();
    long stringBuilderTime = end - start;
    System.out.println("\nUsing StringBuilder...");
    System.out.println("Time taken : " + stringBuilderTime + " milliseconds");
    System.out.println("Final string length : " + stringBuilder.length());

    start = System.currentTimeMillis();
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < num; i++) {stringBuffer.append(str);}
    end = System.currentTimeMillis();
    long stringBufferTime = end - start;
    System.out.println("\nUsing StringBuffer...");
    System.out.println("Time taken : " + stringBufferTime + " milliseconds");
    System.out.println("Final string length : " + stringBuffer.length());

    System.out.println("\nComparison : ");
    if (stringBuilderTime < stringBufferTime) 
      System.out.println("StringBuilder was faster than StringBuffer by " + (stringBufferTime - stringBuilderTime) + " millisecond");
    else if (stringBufferTime < stringBuilderTime) 
      System.out.println("StringBuffer was faster than StringBuilder by " + (stringBuilderTime - stringBufferTime) + " millisecond");
    else System.out.println("Both StringBuilder and StringBuffer took the same amount of time.");
  }
}
