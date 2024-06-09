//Create a method that takes a string input and converts it to an integer. Handle NumberFormatException using try-catch block and prompt the user to enter a valid number upon exception.
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        try {
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter a number: ");
            String input = ob.nextLine();
            int number = Integer.parseInt(input);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
          System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}