// Write a Java program to find the square root of integer numbers. Demonstrate the use of try-catch block to handle ArithmeticException.
import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        try{
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int x = ob.nextInt();
            if(x < 0) throw new ArithmeticException("Negative number");
            System.out.println(Math.sqrt(x));
        }
        catch(ArithmeticException e){System.out.println("Arithmetic Exception : "+e.getMessage());}
    }
}

// public class Q8{

//     public static void main(String[] args) {
//         int[] numbers = {16, 25, -4, 49};

//         for (int number : numbers) {
//             try {
//                 double result = calculateSquareRoot(number);
//                 System.out.println("The square root of " + number + " is: " + result);
//             } catch (ArithmeticException e) {
//                 System.out.println("Cannot calculate square root for " + number + ": " + e.getMessage());
//             }
//         }
//     }

//     public static double calculateSquareRoot(int number) {
//         if (number < 0) {
//             throw new ArithmeticException("Square root of negative numbers is not allowed.");
//         }
//         return Math.sqrt(number);
//     }
// }
