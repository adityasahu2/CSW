//Given an unsorted array of integers from 1 to 10, find smallest positive number missing in the array. Use a hash map HashMap<Integer, Integer> to keep track of elements.
import java.util.*;
public class Q11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the elements of the array : ");
    for(int i=0; i<n; i++) arr[i] = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++)
      if(map.containsKey(arr[i])) map.put(arr[i], map.get(arr[i])+1);
      else map.put(arr[i], 1);
    for(int i=1; i<=10; i++) if(!map.containsKey(i)) System.out.println(i);
  }
}