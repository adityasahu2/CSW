//Declare an array of integers. int[] arr = {1,2,10,8,7,3,4,6,5,9};. Then create a min heap of elements from the array using Priority Queue class. Again Dequeue elements of Priority Queue using appropriate methods.
import java.util.*;
public class Q12{
  public static void main(String [] args){
    int[] arr = {1,2,10,8,7,3,4,6,5,9};
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0; i<arr.length; i++) pq.add(arr[i]);
    while(!pq.isEmpty()) System.out.println(pq.remove());
  }
}