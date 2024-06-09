//Design a Java program that performs matrix operations such as addition, multiplication, and transpose. Introduce scenarios, where accessing elements beyond the bounds of the matrix results in ArrayIndexOutOfBoundsException. Your task is to handle these exceptions effectively and provide meaningful error messages indicating the nature of the exception.
import java.util.Scanner;
public class Q21{
  static Scanner ob = new Scanner(System.in);
  public static void main(String[] args){
    try{
      System.out.print("Enter the number of rows : ");
      int r = ob.nextInt();
      System.out.print("Enter the number of columns : ");
      int c = ob.nextInt();
      int[][] arr1 = new int[r][c];
      int[][] arr2 = new int[r][c];
      System.out.println("Enter the elements of the first matrix : ");
      input(arr1);
      System.out.println("Enter the elements of the second matrix : ");
      input(arr2);
      System.out.println("Sum of the matrices : ");
      int[][] sum = add(arr1, arr2);
      print(sum);
      System.out.println("Product of the matrices : ");
      int[][] product = multiply(arr1, arr2);
      print(product);
      System.out.println("Transpose of the first matrix : ");
      int[][] transpose1 = transpose(arr1);
      print(transpose1);
      System.out.println("Transpose of the second matrix : ");
      int[][] transpose2 = transpose(arr2);
      print(transpose2);
    }
    catch(ArrayIndexOutOfBoundsException e)
      {System.out.println("Array Index Out Of Bounds Exception : "+ e.getMessage());}
  }
  public static void input(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        arr[i][j] = ob.nextInt();
      }
    }
  }
  public static void print(int[][] arr){
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static int[][] add(int[][] arr1, int[][] arr2){
    int [][] sum = new int[arr1.length][arr1[0].length]; 
    for(int i = 0; i < arr1.length ; i++){
      for(int j = 0; j < arr1[0].length; j++){
        sum[i][j] = arr1[i][j] + arr2[i][j];
      }
    } return sum;
  }
  public static int[][] multiply(int [][] arr1, int [][] arr2){
    int [][] product = new int[arr1.length][arr1[0].length];
    for(int i = 0; i < arr1.length; i++){
      for(int j = 0; j < arr1[0].length; j++){
        product[i][j] = arr1[i][j] * arr2[i][j];
      }
    } return product;
  }
  public static int[][] transpose(int[][] arr){
    int [][] transpose = new int[arr[0].length][arr.length];
    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[0].length; j++){
        transpose[j][i] = arr[i][j];
      }
    } return transpose;
  }
}