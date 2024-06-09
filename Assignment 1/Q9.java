// Design a Java program for managing student enrollment in a university, adhering to the principles of loose coupling and high cohesion. Your program should include classes for representing students (`Student`), courses (`Course`), and enrollment management (`Enrollment`). Ensure that the `Enrollment` class interacts with the other classes indirectly through an interface class (`EnrollmentSystem`). Implement methods for enrolling and dropping students from courses, and displaying enrollment details. Create a `Main` class to demonstrate the system's functionality, with appropriate error handling and user-friendly output messages. Provide comments in your code explaining how loose coupling and high cohesion  are maintained throughout the implementation.
interface EnrollmentSystem{
  public void enrollStudent();
  public void dropStudent();
  public void displayEnrollment();
}
class Student{
  private String name;
  private int id;
  private int age;
  public Student(String name, int id, int age){
    this.name = name;
    this.id = id;
    this.age = age;
  }
  public String getName(){return this.name;}
  public int getId(){return this.id;}
  public int getAge(){return this.age;}
}
class Course{
  private String name;
  private int id;
  private int duration;
  public Course(String name, int id, int duration){
    this.name = name;
    this.id = id;
    this.duration = duration;
  }
  public String getName(){return this.name;}
  public int getId(){return this.id;}
  public int getDuration(){return this.duration;}
}
class Enrollment implements EnrollmentSystem{
  private Student student;
  private Course course;
  public Enrollment(Student student, Course course){
    this.student = student;
    this.course = course;
  }
  public void enrollStudent(){
    System.out.println(student.getName() + " has been enrolled in " + course.getName());
  }
  public void dropStudent(){
    System.out.println(student.getName() + " has been dropped from " + course.getName());
  }
  public void displayEnrollment(){
    System.out.println(student.getName() + " with id " + student.getId() + " and " + student.getAge() + " years old has enrolled in " + course.getName() + " with id " + course.getId() + " for " +course.getDuration() + " months");
  }
}
public class Q9{
  public static void main(String[] args){
    Student student = new Student("John", 1, 20);
    Course course = new Course("Math", 1, 3);
    Enrollment enrollment = new Enrollment(student, course);
    enrollment.enrollStudent();
    enrollment.dropStudent();
    enrollment.displayEnrollment();
  }
}