/*
Write a program to create a TreeSet of Integer type and perform the below operation on it.
(a.) Display the TreeSet
(b.) Ask the user to enter a number and search that number is it present in the list or not.
(c.) Remove an element from tree.
*/
import java.util.*;
public class Q6{
    public static void main(String[] args){
        TreeSet<Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n1. Add\n2. Remove\n3. Search\n4. Display\n5. Exit\nEnter your choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter the element to add : ");
                    set.add(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter the element to remove : ");
                    System.out.println(set.remove(sc.nextInt())? "Element removed" : "Element not found");
                    break;
                case 3:
                    System.out.print("Enter the element to search : ");
                    System.out.println(set.contains(sc.nextInt()) ? "Element found":"Element Not Found");
                    break;
                case 4:
                    System.out.println(set);
                    break;
                case 5:
                    System.out.println("Exiting Program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }while(true);     
    }
}