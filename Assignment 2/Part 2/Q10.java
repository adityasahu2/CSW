/*In given large string, find the most occurring words in the string.
Hint:-
a. Create a Hashtable which will keep track of <word, frequency>
b. Iterate through the string and keep track of word frequency by inserting into Hash-Table.
c. When we have a new word, we will insert it into the Hashtable with frequency 1. For all repetition of the word, we will increase the frequency.
d. We can keep track of the most occurring words whenever we are increasing the frequency we can see if this is the most occurring word or not.*/
import java.util.*;
public class Q10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++)
            if(map.containsKey(words[i])) map.put(words[i], map.get(words[i])+1);
            else map.put(words[i], 1);
        int max = 0;
        String word = "";
        for(Map.Entry<String, Integer> entry : map.entrySet())
            if(entry.getValue() > max) {
                max = entry.getValue();
                word = entry.getKey();
            }
        System.out.println(word +" occured "+ max +" times");
    }
}