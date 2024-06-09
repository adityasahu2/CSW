//You are given a string containing alpha-numeric characters. Design a Java program that displays the numeric characters if it is preceded by a vowel and consonant in the given string. If such numeric characters are not present in the given string, display appropriate message. If the input string is null or empty, throw a NullPointerException with an appropriate error message. Ensure that the program handles any potential exceptions gracefully.
public class Q2{
    public static void main(String[] args){
        try{
            String s = "0a1b2c3d45";
            for(int i=1; i<s.length(); i++)
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    if((s.charAt(i-1) >= 97 && s.charAt(i-1) <= 122) || (s.charAt(i-1) >= 65 && s.charAt(i-1) <= 90)) System.out.println(s.charAt(i));     
        } catch(NullPointerException e){System.out.println("Null Pointer Exception : " + e.getMessage());}
    }
}