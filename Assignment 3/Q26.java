//Not sure
//Implement try-catch-finally blocks to handle ClassNotFoundException and MethodNotFoundException.
class MethodNotFoundException extends Exception {
  public MethodNotFoundException(String message) {
    super(message);
  }
}
public class Q26 {
  public static void main(String[] args) {
    try {someMethod();} 
    catch (ClassNotFoundException e) {System.out.println("Class not found exception : " + e.getMessage());} 
    catch (MethodNotFoundException e) {System.out.println("Method not found exception : " + e.getMessage());}     finally {System.out.println("Finally block executed");}
  }
  public static void someMethod() throws ClassNotFoundException, MethodNotFoundException {
    try {Class clazz = Class.forName("SomeClass");} 
    catch (ClassNotFoundException e) {throw new ClassNotFoundException("Class not found in someMethod.");}
    try {throw new MethodNotFoundException("Method not found in someMethod.");} 
    catch (MethodNotFoundException e) {throw new MethodNotFoundException("Method not found in someMethod.");}
  }
}
