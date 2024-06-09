/*Create a class Student having member variable name, age, and mark and required get and set methods. Create a LinkedList of Student type and perform the below operation on it.
(a.) Display the list
(b.) Ask the user to enter a Student object and print the existence of the object. Specify is the object is search according to reference or contain.
(c.) Remove a specified Student object.
(d.) Count the number of object present in the list.
(e.)Override equals method checking if the two Student objects share all the same values.
*/
import java.util.*;
class Student{
  private String name;
  private int age;
  private int mark;
  public Student(String name, int age, int mark){
    this.name = name;
    this.age = age;
    this.mark = mark;
  }
  public String getName(){ return this.name; }
  public int getAge(){ return this.age; }
  public int getMark(){ return this.mark; }
  public void setName(String name){ this.name = name; }
  public void setAge(int age){ this.age = age; }
  public void setMark(int mark){ this.mark = mark; }
  public String toString(){ return this.name + " " + this.age + " " + this.mark; }
  public boolean equals(Object obj){
    if(obj instanceof Student){
      Student s = (Student) obj;
      return this.name.equals(s.name) && this.age == s.age && this.mark == s.mark;
    }return false;
  }
}
public class Q4{
 public static void main(String[] args){
   LinkedList<Student> list = new LinkedList<Student>();
   list.add(new Student("A", 20, 90));
   list.add(new Student("B", 21, 91));
   list.add(new Student("C", 22, 92));
   list.add(new Student("D", 23, 93));
   list.add(new Student("D", 23, 93));
   System.out.println(list);
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a Student object and print the existence of the object. Specify is the object is search according to reference or contain.");
   System.out.println("Enter name, age and mark");
   String name = sc.next();
   int age = sc.nextInt();
   int mark = sc.nextInt();
   Student s = new Student(name, age, mark);
   if(list.contains(s))System.out.println("The object is present in the list");
   else System.out.println("The object is not present in the list");
   System.out.println("Remove a specified Student object.");
   list.remove(s);
   System.out.println(list);
   System.out.println("Count the number of object present in the list.");
   System.out.println(list.size());
   System.out.println("Override equals method checking if the two Student objects share all the same values.");
   System.out.println(list.contains(s));
 } 
} 