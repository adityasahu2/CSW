//Write a java code that comprises of a class Address, having member variable plot no, at, post and required parameterised constructor. Create a Tree map having key as name of a person and value as address. Insert required key and value in the created tree map and use an iterator to display key and value.
import java.util.*;
class Address{
    int plotNo;
    String at, post;
    Address(int plotNo, String at, String post){
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }
    public String toString(){return "Plot No : "+plotNo+"\nArea : "+at+"\nPost : "+post;}
}
public class Q7{
    public static void main(String[] args){
        TreeMap<String, Address> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\n1. Add\n2. Display\n3. Exit\nEnter your choice : ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Enter the name : ");
                    String name = sc.next();
                    System.out.print("Enter the plot no : ");
                    int plotNo = sc.nextInt();
                    System.out.print("Enter the area : ");
                    String at = sc.next();
                    System.out.print("Enter the post : ");
                    String post = sc.next();
                    map.put(name, new Address(plotNo, at, post));
                    break;
                case 2:
                    Iterator<String> itr = map.keySet().iterator();
                    while(itr.hasNext()) {
                        String key = itr.next();
                        System.out.println("Name : "+key + "\n" + map.get(key));
                    }
                    break;
                case 3:
                    System.out.println("Exiting Program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } while(true);
    }
}