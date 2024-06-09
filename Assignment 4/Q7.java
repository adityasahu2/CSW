 //Create a Java program for university student enrollment. Use a Student class for course management and student information. Implement efficient garbage collection for memory management. Utilize Runtime class to monitor memory usage. Override finalize() method to print a message on successful garbage collection.
import java.util.ArrayList;
import java.util.List;
class Student {
  private String name, course;
  private int age;
  public Student(String name, int age, String course) {
    this.name = name;
    this.age = age;
    this.course = course;
  }
  public void finalize() {System.out.println("Object "+name+" is garbage collected");}
  public String getName() {return name;}
  public int getAge() {return age;}
  public String getCourse() {return course;}
  public void setName(String name) {this.name = name;}
  public void setAge(int age) {this.age = age;}
  public void setCourse(String course) {this.course = course;}
}
public class Q7 {
  public static void main(String[] args) {
    List<Student> students = new ArrayList();
    for (int i = 0; i < 1000000; i++) {
      Student student = new Student("Student" + i, 20 + i % 10, "Course" + i % 5);
      students.add(student);
    }
    Runtime runtime = Runtime.getRuntime();
    long initialMemory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Initial Memory Usage: " + initialMemory);
    System.gc();
    long finalMemory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Final Memory Usage: " + finalMemory);
  }
}