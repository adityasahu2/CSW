//Find if two strings are anagrams, an anagram is a word or phrase formed by reordering the letters of another word or phrase. Declare two strings str1 and str2 and initialize. Create a HashMap<Character, Integer> and use methods containsKey() ,put() ,get() to check the strings.
import java.util.*;
public class Q8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String str1 = sc.next();
        System.out.print("Enter the second string : ");
        String str2 = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str1.length(); i++)
            if(map.containsKey(str1.charAt(i))) map.put(str1.charAt(i), map.get(str1.charAt(i))+1);
            else map.put(str1.charAt(i), 1);
        for(int i=0; i<str2.length(); i++)
            if(map.containsKey(str2.charAt(i))) map.put(str2.charAt(i), map.get(str2.charAt(i))-1);
            else map.put(str2.charAt(i), -1);
        int c = 0;
        for(int i=0; i<str1.length(); i++)
            if(map.get(str1.charAt(i)) != 0) {
                c++;
                break;
            }
        System.out.println(c==0 ? "Strings are anagrams": "Strings are not anagrams");
    }
}