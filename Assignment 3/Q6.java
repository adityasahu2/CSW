//Write a Java program to handle NumberFormatException.
public class Q6{
    public static void main(String[] args){
        try{int x = Integer.parseInt("A");}
        catch(NumberFormatException e){System.out.println("Number Format Exception : "+e.getMessage());}
    }
}