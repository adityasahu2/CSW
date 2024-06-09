//Given an array of integers, print the repeating integers in the array with the help of a HashSet.
import java.util.*;
public class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        System.out.print("The repeating elements are : ");
        for(int i=0; i<n; i++)
            if(set.contains(arr[i])) System.out.print(arr[i]+", ");
            else set.add(arr[i]);
    }
}