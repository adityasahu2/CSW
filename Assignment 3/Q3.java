//Implement a custom NullPointerException class named CustomNullPointerException that mimics the behavior of the standard NullPointerException, but instead of using default error messages or null references, it takes a String message as its constructor argument. Your task is to create this custom exception class and demonstrate its usage in a Java program.
class CustomNullPointerException extends NullPointerException{
    public CustomNullPointerException(String message){super(message);}
}
public class Q3{
    public static void main(String[] args){
        try{throw new CustomNullPointerException("This is a custom exception");}
        catch(CustomNullPointerException e){System.out.println(e.getMessage());}
    }
}
