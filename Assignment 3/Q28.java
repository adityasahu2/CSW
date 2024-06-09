  //Implement a Java program to handle StackOverflowError.
  public class Q28 {
    public static void main(String[] args) {
      try {recursiveMethod(0);} 
      catch (StackOverflowError e) {
        System.out.println("Stack Overflow Error : " + e.getMessage());
        System.out.println("Exiting program due to StackOverflowError.");
      }
    }
    public static void recursiveMethod(int n) {
      System.out.println("Current recursion level: " + n);
      recursiveMethod(n + 1);
    }
  }