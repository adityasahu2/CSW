//Develop a program that performs complex mathematical (may have log, trigonometric and algebraic functions) computations. Handle unchecked NullPointerException gracefully using try-catch block and provide a meaningful error message.
import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        try{
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter a number : ");
            int x = ob.nextInt();
            System.out.println(Math.sqrt(Math.abs(Math.sin(x) * Math.cos(x))) / (Math.tan(x) + 1));
        }
        catch(NullPointerException e){System.out.println("Null Pointer Exception : "+e.getMessage());}
    }
}
// public class Q5{
//     public static void main(String[] args){
//         try{
//             double x = Double.parseDouble(args[0]);
//             double y = Double.parseDouble(args[1]);
//             System.out.println(Math.log(x) / Math.log(y));
//         }
//         catch(NullPointerException e){System.out.println("Null Pointer Exception");}
//         catch(NumberFormatException e){System.out.println("Number Format Exception");}
//         catch(ArithmeticException e){System.out.println("Arithmetic Exception");}
//     }
// }