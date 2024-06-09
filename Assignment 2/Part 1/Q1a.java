//Write a program to create a Student class that has members, name, roll number, and age. Design the Student class in such a way that it can take the roll number as an integer or string. Create a driver class that creates student objects and invokes the methods.
class Student <T>{
  String name;
  T roll_no;
  int age;
  public Student(String name,T roll_no,int age){
    this.name=name;
    this.roll_no=roll_no;
    this.age=age;
  }
  public void display(){
    System.out.println("Name : "+name);
    System.out.println("Roll no : "+roll_no);
    System.out.println("Age : "+age);
  }
}
public class Q1a{
  public static void main(String[] args){
    Student <Integer> s1=new Student <> ("Rahul",123,20);
    Student <String> s2=new Student <>("Rahul","A123",20);
    s1.display();
    s2.display();
  }
}