//Implement a Java program that involves dynamic data structures such as linked lists or trees, where elements are stored in arrays. Introduce scenarios, where accessing elements beyond the bounds of the array backing the data structure results in ArrayIndexOutOfBoundsException. Your task is to implement bounds checking and handle these exceptions effectively while maintaining the integrity of the data structure.
import java.util.LinkedList;
import java.util.Scanner;
public class Q17{
  public static void main(String[] args){
    try{
      LinkedList ll = new LinkedList();
      for(int i = 0; i < 5; i++) ll.add(i);
      Scanner ob = new Scanner(System.in);
      System.out.print("Enter a number : ");
      int x = ob.nextInt();
      if(x >= ll.size()) throw new ArrayIndexOutOfBoundsException();
      System.out.println(ll.get(x));
    }
    catch(ArrayIndexOutOfBoundsException e){System.out.println("Array Index Out Of Bounds Exception : "+e.getMessage());}
  }
}
